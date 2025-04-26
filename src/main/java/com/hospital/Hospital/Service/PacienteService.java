package com.hospital.Hospital.Service;

import com.hospital.Hospital.Model.Paciente;
import com.hospital.Hospital.Repository.PacienteRepository;

import jakarta.transaction.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional; //Para evitar escribir validaciones y excepciones

@Service
public class PacienteService {

    @Autowired 
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Paciente findById(int id){
        return pacienteRepository.findById(id).orElseThrow(()-> new RuntimeException("Category not found"));
    }

    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public void deleteById(int id){
        pacienteRepository.deleteById(id);
    }
}
