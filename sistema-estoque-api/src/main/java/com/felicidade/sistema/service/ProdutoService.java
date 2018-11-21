package com.felicidade.sistema.service;

import java.util.List;

import com.felicidade.sistema.entity.Produto;

public interface ProdutoService {

	  void save(Produto produto );

	  void update(Produto produto);

	  void delete(Integer id);

	  Produto findById(Integer id);

	  List<Produto> findAll();
}
