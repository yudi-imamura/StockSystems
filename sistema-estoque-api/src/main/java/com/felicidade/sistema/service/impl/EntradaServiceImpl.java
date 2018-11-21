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

import com.felicidade.sistema.dao.EntradaDAO;
import com.felicidade.sistema.entity.Entrada;
import com.felicidade.sistema.service.EntradaService;

@Service @Transactional(readOnly = false)
public class EntradaServiceImpl implements EntradaService {


	@Autowired
	private EntradaDAO dao;

	@Override
	public Iterable<Entrada> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Entrada> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrada> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Entrada> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Entrada> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Entrada> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Entrada> findAllById(Iterable<Long> ids) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Entrada entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Entrada> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveEntrada(Entrada entrada) {
		dao.save(entrada);
	}

	@Override
	public void update(Entrada entrada) {
		dao.update(entrada);
	}

	@Transactional(readOnly = true)
	@Override
	public Entrada buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Page<Entrada> findAll(int paginas, int nr_registros) {
		PageRequest page = PageRequest.of(paginas, nr_registros);
		return this.findAll(page);
	}
	

}
