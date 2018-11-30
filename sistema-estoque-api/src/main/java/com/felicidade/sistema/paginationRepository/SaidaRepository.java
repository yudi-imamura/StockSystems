package com.felicidade.sistema.paginationRepository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.felicidade.sistema.entity.Saida;
import com.felicidade.sistema.entity.SaidaPK;

public interface SaidaRepository extends PagingAndSortingRepository<Saida,SaidaPK> {

}
