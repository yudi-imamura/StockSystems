package com.felicidade.sistema.dao.impl;
import org.springframework.stereotype.Repository;

import com.felicidade.sistema.dao.AbstractDAO;
import com.felicidade.sistema.dao.EstoqueDAO;
import com.felicidade.sistema.entity.Estoque;
import com.felicidade.sistema.entity.EstoquePK;

@Repository
public class EstoqueDAOImpl extends AbstractDAO<Estoque, EstoquePK> implements EstoqueDAO {

}
