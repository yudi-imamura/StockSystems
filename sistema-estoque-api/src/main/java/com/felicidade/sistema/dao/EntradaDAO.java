package com.felicidade.sistema.dao;

import java.util.List;

import com.felicidade.sistema.entity.Entrada;

public interface EntradaDAO {

	void save(Entrada entrada );

	void update(Entrada entrada);

	Entrada findById(long id);

	List<Entrada> findAllBy(String query,Object...params);
}
