package com.felicidade.sistema.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.felicidade.sistema.dao.AbstractDAO;
import com.felicidade.sistema.dao.Entrada_LoteDAO;
import com.felicidade.sistema.entity.Entrada_Lote;

@Repository
public class Entrada_LoteDAOImpl extends AbstractDAO<Entrada_Lote, Long> implements Entrada_LoteDAO {

	@Autowired
	private EntityManager em;
	
	@Override
	public Entrada_Lote findById(long id) {
		return em.find(Entrada_Lote.class, id);
	}

	@Override
	public void delete(long id) {
		Entrada_Lote lote = em.find(Entrada_Lote.class, id);
		em.remove(lote);
	}
}
