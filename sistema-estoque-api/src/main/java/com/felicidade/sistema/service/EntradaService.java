package com.felicidade.sistema.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.felicidade.sistema.entity.Entrada;

public interface EntradaService {

	void save(Entrada entrada );

	void update(Entrada entrada);

	Entrada findbyId(Long id);

	List<Entrada> findAll(String jpql , Object...params);
	
	Page<Entrada> findAll(int paginas,int nr_registros);
	
}
