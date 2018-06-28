package com.weliton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weliton.cursomc.domain.Cliente;
import com.weliton.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	
	//public Categoria buscar(Integer id) throws ObjectNotFoundException  {
		//Optional<Categoria> obj = repo.findById(id);
		//return obj.orElseThrow(() -> new ObjectNotFoundException(
			//	"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));	
		
	//}
	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
	

}
