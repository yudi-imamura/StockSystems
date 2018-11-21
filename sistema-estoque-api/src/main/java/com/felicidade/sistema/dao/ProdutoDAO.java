package com.felicidade.sistema.dao;

import java.util.List;

import com.felicidade.sistema.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoDAO {

	  void save(Produto produto );

	  void update(Produto produto);

	  void delete(Integer id);

	  Produto findById(Integer id);

	  List<Produto> findAll();
}
