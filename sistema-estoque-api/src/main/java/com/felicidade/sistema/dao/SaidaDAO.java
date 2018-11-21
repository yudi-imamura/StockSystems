package com.felicidade.sistema.dao;

import java.util.List;

import com.felicidade.sistema.entity.Saida;
import com.felicidade.sistema.entity.SaidaPK;

public interface SaidaDAO {

	void save(Saida saida );

	void update(Saida entrada_lote);

	Saida findById(SaidaPK entradaPK);

    List<Saida> findAll();
	
}
