package com.springboot.backend.apirest.controller;

import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.apirest.models.entity.Cliente;
import com.springboot.backend.apirest.service.ClienteService;
import com.springboot.backend.apirest.service.impl.ClienteServiceImpl;

//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	@Qualifier("clienteServiceImpl")
	private ClienteService clientService;
	
	@GetMapping("/clientes")
	public List<Cliente> getClientes(){
		return clientService.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente getCliente(@PathVariable Long id) {
		return clientService.findById(id);	
	}
	
	@GetMapping("/ejemplo")
	public String ejemplo() {
		return "ejemplo5";
	}
	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente insertCliente(@RequestBody Cliente cliente) {
		return clientService.save(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCliente(@PathVariable Long id) {
		 clientService.delete(id);
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente updateCliente(@RequestBody Cliente cliente,@PathVariable Long id) {
		Cliente cl = clientService.findById(id);
		cl.setApellido(cliente.getApellido());
		cl.setNombre(cliente.getNombre());
		cl.setCreateAt(cliente.getCreateAt());
		cl.setEmail(cliente.getEmail());
		return clientService.save(cl);
	}
}
