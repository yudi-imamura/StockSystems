package com.felicidade.sistema.dao;

import java.util.List;

import com.felicidade.sistema.entity.Estoque;
import com.felicidade.sistema.entity.EstoquePK;

public interface EstoqueDAO {

	 void save(Estoque estoque );

	  void update(Estoque estoque);

	  Estoque findById(EstoquePK estoqueId);

	  List<Estoque> findAll();
	
}
