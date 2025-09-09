package com.brisas.las_brisas.repository.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brisas.las_brisas.DTO.application.application_typeDTO;

@Repository
public interface Iapplication_type extends JpaRepository<application_typeDTO, Integer> {
}
