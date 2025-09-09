package com.brisas.las_brisas.DTO.training;

import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class induction_employeeDTO {
    private int id;
    private int inductionId;
    private int employeeId;
    private LocalDateTime dateAssignment;
    private LocalDateTime dateComplete;
    private LocalDateTime deadline;
    private LocalDateTime dateSeen;
    private String status; 
    private String visto;  
    private int points;
}
