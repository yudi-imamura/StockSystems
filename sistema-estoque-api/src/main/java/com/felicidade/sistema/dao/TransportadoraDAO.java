package com.felicidade.sistema.dao;

import java.util.List;

import com.felicidade.sistema.entity.Transportadora;

public interface TransportadoraDAO {

	void save(Transportadora transportadora );

	void update(Transportadora transportadora);

	Transportadora findById(Long id);

    List<Transportadora> findAll();
	
}
