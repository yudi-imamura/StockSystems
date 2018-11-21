package com.felicidade.sistema.dao;

import com.felicidade.sistema.entity.Entrada_Lote;

public interface Entrada_LoteDAO {


	void save(Entrada_Lote entrada );

	void update(Entrada_Lote entrada);

	Entrada_Lote findById(long id);
	
	void delete(long id);

    }
