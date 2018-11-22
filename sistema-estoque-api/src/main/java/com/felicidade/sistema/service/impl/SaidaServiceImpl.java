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

import com.felicidade.sistema.dao.SaidaDAO;
import com.felicidade.sistema.entity.Saida;
import com.felicidade.sistema.entity.SaidaPK;
import com.felicidade.sistema.service.SaidaService;


@Service 
@Transactional(readOnly = false)
public class SaidaServiceImpl implements SaidaService {

	@Autowired
	private SaidaDAO dao;

	@Override
	public Iterable<Saida> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Saida> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Saida> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Saida> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Saida> findById(SaidaPK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(SaidaPK id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Saida> findAllById(Iterable<SaidaPK> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(SaidaPK id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Saida entity) {
		this.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Saida> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		this.deleteAll();
	}

	@Override
	public void saveSaida(Saida saida) {
		dao.update(saida);
	}

	@Override
	public void update(Saida saida) {
		dao.update(saida);
	}

	@Transactional(readOnly = true)
	public Saida buscarPorSaida(SaidaPK entradaPK) {
		return dao.findById(entradaPK);
	}

	@Override
	public List<Saida> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Transactional(readOnly = true)
	public Page<Saida> findAll(int paginas, int nr_registros) {
		Pageable page = PageRequest.of(paginas, nr_registros);
		return this.findAll(page);
	}
	

}
