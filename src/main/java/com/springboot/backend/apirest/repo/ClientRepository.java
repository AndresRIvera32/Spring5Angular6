package com.springboot.backend.apirest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.backend.apirest.models.entity.Cliente;

@Repository(value = "clientRepository")	
public interface ClientRepository extends JpaRepository<Cliente,Long> {

}
