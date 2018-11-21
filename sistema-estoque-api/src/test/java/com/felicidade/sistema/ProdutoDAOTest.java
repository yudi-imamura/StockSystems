package com.felicidade.sistema;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.felicidade.sistema.dao.ProdutoDAO;
import com.felicidade.sistema.entity.Categoria;
import com.felicidade.sistema.entity.Produto;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ContextConfiguration(classes= {Produto.class,ProdutoDAO.class})
@EnableAutoConfiguration
public class ProdutoDAOTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private ProdutoDAO dao;

	private Produto getProduto(){
		Produto p = new Produto("Coca-Cola",12,1.5,Categoria.BEBIDAS);
		return p;
	}
	
	@Test
	public void testSaveProduto(){
		Produto p = getProduto();
		Produto p2 = entityManager.persist(p);
	
	}
	

}
