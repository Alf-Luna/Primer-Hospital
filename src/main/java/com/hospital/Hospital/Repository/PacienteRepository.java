package com.hospital.Hospital.Repository;

import com.hospital.Hospital.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    
}
