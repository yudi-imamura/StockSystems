package com.felicidade.sistema.dao;

import java.util.List;

import com.felicidade.sistema.entity.Cidade;

public interface CidadeDAO {

	void save(Cidade cidade );

	void update(Cidade cidade);

	Cidade findById(Integer CidadeId);

    List<Cidade> findAll();

    void delete(Integer cidadeId);
}
