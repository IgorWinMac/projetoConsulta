package com.example.demo.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Paciente;

@Repository
public interface PacienteRepositorio extends PagingAndSortingRepository<Paciente, Long>{
	
	 List<Paciente> findAll(); 
	 

}
