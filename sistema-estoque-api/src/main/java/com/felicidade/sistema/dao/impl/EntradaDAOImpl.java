package com.felicidade.sistema.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.felicidade.sistema.dao.AbstractDAO;
import com.felicidade.sistema.dao.EntradaDAO;
import com.felicidade.sistema.entity.Entrada;
import com.felicidade.sistema.entity.Entrada_Lote;

@Repository
public class EntradaDAOImpl extends AbstractDAO<Entrada, Long> implements EntradaDAO {

	@Autowired
	private EntityManager em;
	
	@Override
	public Entrada findById(long id) {
		return em.find(Entrada.class, id);
	}
}
