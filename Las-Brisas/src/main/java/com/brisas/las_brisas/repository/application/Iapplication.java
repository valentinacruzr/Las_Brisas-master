package com.brisas.las_brisas.repository.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brisas.las_brisas.DTO.application.application;

@Repository
public interface Iapplication extends JpaRepository<application, Integer> {
   
}
