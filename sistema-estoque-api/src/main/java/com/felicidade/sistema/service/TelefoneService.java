package com.felicidade.sistema.service;

import java.util.List;

import com.felicidade.sistema.entity.Telefone;
import com.felicidade.sistema.entity.TelefonePK;

public interface TelefoneService {

	void save(Telefone telefone );

	void update(Telefone telefone);

	Telefone findById(TelefonePK TelefoneId);

    List<Telefone> findAll();

    void delete(TelefonePK TelefoneId);
	
}
