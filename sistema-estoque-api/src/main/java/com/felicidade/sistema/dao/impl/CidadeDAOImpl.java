package com.felicidade.sistema.dao.impl;

import org.springframework.stereotype.Repository;

import com.felicidade.sistema.dao.AbstractDAO;
import com.felicidade.sistema.dao.CidadeDAO;
import com.felicidade.sistema.entity.Cidade;

@Repository
public class CidadeDAOImpl extends AbstractDAO<Cidade, Integer> implements CidadeDAO {

}
