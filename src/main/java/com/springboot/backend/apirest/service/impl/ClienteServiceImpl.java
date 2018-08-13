package com.springboot.backend.apirest.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.apirest.models.entity.Cliente;
import com.springboot.backend.apirest.repo.ClientRepository;
import com.springboot.backend.apirest.service.ClienteService;

@Service(value = "clienteServiceImpl")
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClientRepository clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}
	
	

}
