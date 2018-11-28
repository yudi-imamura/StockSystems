package com.felicidade.sistema.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.felicidade.sistema.entity.Transportadora;

public interface TransportadoraService {

	void save(Transportadora transportadora );

	void update(Transportadora transportadora);

	Transportadora findById(Long id);

    List<Transportadora> findAll();
	
    Page<Transportadora> findAllwithPagination(int page, int count);
	
}
