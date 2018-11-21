package com.felicidade.sistema.service;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.felicidade.sistema.entity.Entrada;

public interface EntradaService extends PagingAndSortingRepository<Entrada,Long> {

	void saveEntrada(Entrada entrada );

	void update(Entrada entrada);

	Entrada buscarPorId(Long id);

    Page<Entrada> findAll(int paginas,int nr_registros);
	
}
