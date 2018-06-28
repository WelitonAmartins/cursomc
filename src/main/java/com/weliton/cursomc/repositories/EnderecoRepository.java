package com.weliton.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weliton.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer> {

}
