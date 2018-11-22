package com.felicidade.sistema.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felicidade.sistema.dao.Entrada_LoteDAO;
import com.felicidade.sistema.entity.Entrada_Lote;
import com.felicidade.sistema.entity.Estoque;
import com.felicidade.sistema.service.Entrada_LoteService;

@Service 
@Transactional(readOnly = false)
public class Entrada_LoteServiceImpl implements Entrada_LoteService {

	@Autowired
	private Entrada_LoteDAO dao;

	@Override
	public Iterable<Entrada_Lote> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Entrada_Lote> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrada_Lote> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrada_Lote> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Entrada_Lote> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Entrada_Lote> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Entrada_Lote> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		dao.delete(id);
	}

	@Override
	public void delete(Entrada_Lote entity) {

	}

	@Override
	public void deleteAll(Iterable<? extends Entrada_Lote> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveLote(Entrada_Lote entrada_lote) {
		dao.save(entrada_lote);
	}

	@Override
	public void update(Entrada_Lote entrada_lote) {
		dao.update(entrada_lote);
	}

	@Transactional(readOnly = true)
	@Override
	public Page<Entrada_Lote> findAll(int paginas, int nr_registros) {
		Pageable page = PageRequest.of(paginas, nr_registros);
		return this.findAll(page);
	}



	



}
