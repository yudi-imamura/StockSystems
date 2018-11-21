package com.felicidade.sistema.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

@Entity
@Table(name="TB_FELICIDADE_SAIDA")
public class Saida implements Serializable{

	@EmbeddedId
	private SaidaPK id_saida; 
	
	@Column(name="vl_total",nullable=false)
	@Digits(integer=12,fraction=2)
	@DecimalMin("2.00")
	private BigDecimal vl_total;
	
	@Min(1)
	@Column(nullable=false)
	private int qtde_saida;
	
	@Column(nullable=false)
	private LocalDateTime dt_saida;
	
	@MapsId("cd_produto")
	@JoinColumn(name="cd_produto")
	@ManyToOne
	private Produto produto;
	
	@JoinColumns({@JoinColumn(name="cd_estoque", referencedColumnName="cd_estoque",updatable=false),
		@JoinColumn(name="nr_estocado", referencedColumnName="nr_estocado",updatable=false)})			
	@ManyToOne
	private Estoque estoque;

	public Saida(@Digits(integer = 12, fraction = 2) @DecimalMin("2.00") BigDecimal vl_total, @Min(1) int qtde_saida,
			LocalDateTime dt_saida, Produto produto, Estoque estoque) {
		super();
		this.vl_total = vl_total;
		this.qtde_saida = qtde_saida;
		this.dt_saida = dt_saida;
		this.produto = produto;
		this.estoque = estoque;
	}

	public Saida() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaidaPK getId_saida() {
		return id_saida;
	}

	public void setId_saida(SaidaPK id_saida) {
		this.id_saida = id_saida;
	}

	public BigDecimal getVl_total() {
		return vl_total;
	}

	public void setVl_total(BigDecimal vl_total) {
		this.vl_total = vl_total;
	}

	public int getQtde_saida() {
		return qtde_saida;
	}

	public void setQtde_saida(int qtde_saida) {
		this.qtde_saida = qtde_saida;
	}

	public LocalDateTime getDt_saida() {
		return dt_saida;
	}

	public void setDt_saida(LocalDateTime dt_saida) {
		this.dt_saida = dt_saida;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	
	
}
