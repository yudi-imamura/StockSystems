package com.felicidade.sistema.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Check;

@Entity
@Table(name="TB_FELICIDADE_PRODUTO",
uniqueConstraints = {@UniqueConstraint(columnNames="nm_produto")})
@Check(constraints = "qtde_min<10")
public class Produto implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cd_produto;
	
	@Column(name="nm_produto",length=150,nullable=false)
	private String nome;
	
	@Column(length=4,nullable=false)
	private int qtde_min;
	
	@Column(name="nr_peso",nullable=false,precision=10,scale=2)
	private Double peso;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_categoria", nullable=false)
	private Categoria categoria;
	
	@OneToMany(mappedBy="produto", cascade = CascadeType.REFRESH)
	private List<Entrada_Lote> entrada_lotes;
	
	@OneToMany(mappedBy="produto")
	private List<Saida> saida;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produto(String nome, int qtde_min, Double peso, Categoria categoria) {
		super();
		this.nome = nome;
		this.qtde_min = qtde_min;
		this.peso = peso;
		this.categoria = categoria;
	}
	public int getCd_produto() {
		return cd_produto;
	}
	public void setCd_produto(int cd_produto) {
		this.cd_produto = cd_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtde_min() {
		return qtde_min;
	}
	public void setQtde_min(int qtde_min) {
		this.qtde_min = qtde_min;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
