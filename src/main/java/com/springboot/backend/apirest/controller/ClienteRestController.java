package com.springboot.backend.apirest.controller;

import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.apirest.models.entity.Cliente;
import com.springboot.backend.apirest.service.ClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	@Qualifier("clienteServiceImpl")
	private ClienteService clientService;
	
	@GetMapping("/clientes")
	public List<Cliente> getCliente(){
		return clientService.findAll();
	}

}
