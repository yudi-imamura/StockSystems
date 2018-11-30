package com.felicidade.sistema.paginationRepository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.felicidade.sistema.entity.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto,Integer> {

}
