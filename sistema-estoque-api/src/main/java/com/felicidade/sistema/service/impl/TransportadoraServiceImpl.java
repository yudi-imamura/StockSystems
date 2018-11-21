package com.felicidade.sistema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felicidade.sistema.dao.TransportadoraDAO;
import com.felicidade.sistema.entity.Transportadora;
import com.felicidade.sistema.service.TransportadoraService;

@Service 
@Transactional(readOnly = false)
public class TransportadoraServiceImpl implements TransportadoraService {

	@Autowired
	private TransportadoraDAO dao;
	
	@Override
	public void save(Transportadora transportadora) {
		dao.save(transportadora);
	}

	@Override
	public void update(Transportadora transportadora) {
		dao.update(transportadora);
	}

	@Transactional(readOnly = true)
	@Override
	public Transportadora findById(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Transportadora> findAll() {
		return dao.findAll();
	}

}
