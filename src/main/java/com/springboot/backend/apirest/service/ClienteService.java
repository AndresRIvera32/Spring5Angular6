package com.springboot.backend.apirest.service;

import java.util.List;

import com.springboot.backend.apirest.models.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}
