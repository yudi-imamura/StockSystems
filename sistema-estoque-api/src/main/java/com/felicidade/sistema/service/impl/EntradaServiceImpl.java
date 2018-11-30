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
import com.felicidade.sistema.paginationRepository.EntradaRepository;
import com.felicidade.sistema.service.EntradaService;

@Service @Transactional(readOnly = false)
public class EntradaServiceImpl implements EntradaService {


	@Autowired
	private EntradaDAO dao;

	private EntradaRepository repository;

	@Transactional(readOnly = true)
	@Override
	public Page<Entrada> findAll(int paginas, int nr_registros) {
		Pageable page = PageRequest.of(paginas, nr_registros);
		return null;
	}


	@Override
	public void save(Entrada entrada) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Entrada entrada) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Entrada findbyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Entrada> findAll(String jpql, Object... params) {
		jpql = "Select * from tb_felicidade_entrada where params = (:params)";
		
		return null;
	}
	

}
