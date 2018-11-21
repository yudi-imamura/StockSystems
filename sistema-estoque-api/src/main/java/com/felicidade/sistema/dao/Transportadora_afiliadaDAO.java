package com.felicidade.sistema.dao;

import java.util.List;

import com.felicidade.sistema.entity.AfiliadaPK;
import com.felicidade.sistema.entity.Transportadora_afiliada;

public interface Transportadora_afiliadaDAO {

	void save(Transportadora_afiliada afiliada );

	void update(Transportadora_afiliada afiliada);

	Transportadora_afiliada findById(AfiliadaPK id);

    List<Transportadora_afiliada> findAll();

    void delete(String nome);
}
