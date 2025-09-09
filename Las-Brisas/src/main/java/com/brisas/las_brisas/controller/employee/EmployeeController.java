package com.brisas.las_brisas.controller.employee;

import com.brisas.las_brisas.DTO.ResponseDTO;
import com.brisas.las_brisas.DTO.employee.employeeDTO;
import com.brisas.las_brisas.model.employee.employee;
import com.brisas.las_brisas.service.employee.employeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final employeeService employeeService;

    @GetMapping
    public ResponseEntity<List<employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable int id) {
        Optional<employee> emp = employeeService.findById(id);
        if (emp.isEmpty()) {
            return ResponseEntity.status(404).body(new ResponseDTO<>("Empleado no encontrado", "404", null));
        }
        return ResponseEntity.ok(emp.get());
    }

    @PostMapping
    public ResponseEntity<ResponseDTO<employeeDTO>> saveEmployee(@RequestBody employeeDTO dto) {
        ResponseDTO<employeeDTO> response = employeeService.save(dto);
        return ResponseEntity.status(Integer.parseInt(response.getStatus())).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO<employeeDTO>> deleteEmployee(@PathVariable int id) {
        ResponseDTO<employeeDTO> response = employeeService.deleteEmployee(id);
        return ResponseEntity.status(Integer.parseInt(response.getStatus())).body(response);
    }
}
