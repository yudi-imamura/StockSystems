package com.felicidade.sistema.dao.impl;

import org.springframework.stereotype.Repository;

import com.felicidade.sistema.dao.AbstractDAO;
import com.felicidade.sistema.dao.Transportadora_afiliadaDAO;
import com.felicidade.sistema.entity.AfiliadaPK;
import com.felicidade.sistema.entity.Saida;
import com.felicidade.sistema.entity.SaidaPK;
import com.felicidade.sistema.entity.Transportadora_afiliada;

@Repository
public class Transportadora_afiliadaDAOImpl extends  AbstractDAO<Transportadora_afiliada, AfiliadaPK> implements Transportadora_afiliadaDAO{

	@Override
	public void delete(String nome) {
		// TODO Auto-generated method stub
		
	}

}
