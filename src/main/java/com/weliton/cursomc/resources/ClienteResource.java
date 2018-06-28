package com.weliton.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weliton.cursomc.domain.Cliente;
import com.weliton.cursomc.services.ClienteService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		/* Cliente cat1 = new Cliente(1, "informatica");
		Cliente cat2 = new Cliente(2, "Escritorio");

		
		List<Cliente>lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
*/
	}

}
