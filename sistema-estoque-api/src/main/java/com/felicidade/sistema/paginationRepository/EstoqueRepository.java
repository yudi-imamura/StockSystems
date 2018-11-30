package com.felicidade.sistema.paginationRepository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.felicidade.sistema.entity.Estoque;
import com.felicidade.sistema.entity.EstoquePK;

public interface EstoqueRepository extends PagingAndSortingRepository<Estoque,EstoquePK> {

}
