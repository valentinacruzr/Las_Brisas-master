package com.brisas.las_brisas.DTO.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class user_rolDTO {
    private int id;
    private int idUser;
    private int idRol;
    private String userName;    // Para mostrar el nombre del usuario
    private String rolName;     // Para mostrar el nombre del rol
}