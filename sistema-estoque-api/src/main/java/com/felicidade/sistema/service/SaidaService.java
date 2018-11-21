package com.felicidade.sistema.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.felicidade.sistema.entity.Saida;
import com.felicidade.sistema.entity.SaidaPK;

public interface SaidaService extends PagingAndSortingRepository<Saida,Long> {


	void saveSaida(Saida saida );

	void update(Saida saida);

	Saida buscarPorSaida(SaidaPK entradaPK);

    List<Saida> findAll();

    Page<Saida> findAll(int paginas, int nr_registros);

}
