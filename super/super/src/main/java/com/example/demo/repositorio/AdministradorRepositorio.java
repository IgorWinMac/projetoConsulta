/*
package com.example.demo.repositorio;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.modelo.Administrador;

public interface AdministradorRepositorio extends CrudRepository<Administrador, Long>{
	
	@Query(value="select s from login s where s.login.id = :id order by nome" )
	public Collection<Administrador> findAllLogin(@Param(value = "id") Long id);

}
*/