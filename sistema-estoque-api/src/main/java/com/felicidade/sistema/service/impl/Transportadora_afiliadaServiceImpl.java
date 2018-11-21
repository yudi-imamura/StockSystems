package com.felicidade.sistema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felicidade.sistema.dao.Transportadora_afiliadaDAO;
import com.felicidade.sistema.entity.AfiliadaPK;
import com.felicidade.sistema.entity.Transportadora_afiliada;
import com.felicidade.sistema.service.Transportadora_afiliadaService;

@Service 
@Transactional(readOnly = false)
public class Transportadora_afiliadaServiceImpl implements Transportadora_afiliadaService {

	@Autowired
	private Transportadora_afiliadaDAO dao;
	
	@Override
	public void save(Transportadora_afiliada afiliada) {
		dao.save(afiliada);

	}

	@Override
	public void update(Transportadora_afiliada afiliada) {
		dao.update(afiliada);
	}

	@Override
	public Transportadora_afiliada findById(AfiliadaPK id) {
		return dao.findById(id);
	}

	@Override
	public List<Transportadora_afiliada> findAll() {
		return dao.findAll();
	}

	@Override
	public void delete(String nome) {
		dao.delete(nome);
	}

}
