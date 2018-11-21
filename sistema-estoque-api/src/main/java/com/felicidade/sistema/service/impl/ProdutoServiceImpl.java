package com.felicidade.sistema.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felicidade.sistema.dao.ProdutoDAO;
import com.felicidade.sistema.entity.Produto;
import com.felicidade.sistema.service.ProdutoService;

@Service @Transactional(readOnly = false)
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoDAO dao;
	
	@Override
	public void save(Produto produto) {
		dao.save(produto);
		
	}

	@Override
	public void update(Produto produto) {
		dao.update(produto);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Produto findById(Integer id) {
		return dao.findById(id);
	
	}

	@Transactional(readOnly = true)
	@Override
	public List<Produto> findAll() {
		return dao.findAll();
	}

}
