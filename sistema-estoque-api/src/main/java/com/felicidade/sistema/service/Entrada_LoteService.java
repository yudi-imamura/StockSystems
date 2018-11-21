package com.felicidade.sistema.service;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.felicidade.sistema.entity.Entrada_Lote;

public interface Entrada_LoteService extends PagingAndSortingRepository<Entrada_Lote,Long> {

	void saveLote(Entrada_Lote entrada_lote);
	
	void update(Entrada_Lote entrada_lote);

    Page<Entrada_Lote> findAll(int paginas, int nr_registros);
	
   /* void updateSaleForLote(int qntde_saida,Estoque estoque);*/
}
