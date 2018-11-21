package com.felicidade.sistema.service;

import java.util.List;

import com.felicidade.sistema.entity.Cidade;

public interface CidadeService {

	void save(Cidade cidade );

	void update(Cidade cidade);

	Cidade findById(Integer CidadeId);

    List<Cidade> findAll();

}
