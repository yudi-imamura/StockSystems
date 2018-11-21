package com.felicidade.sistema.service;

import java.util.List;

import com.felicidade.sistema.entity.Transportadora;

public interface TransportadoraService {

	void save(Transportadora transportadora );

	void update(Transportadora transportadora);

	Transportadora findById(Long id);

    List<Transportadora> findAll();
	
	
}
