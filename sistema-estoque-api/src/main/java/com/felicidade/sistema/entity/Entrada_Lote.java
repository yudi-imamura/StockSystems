package com.felicidade.sistema.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

@Entity
@Table(name="TB_FELICIDADE_ENTRADA_LOTE")
public class Entrada_Lote implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cd_lote;
	
	@Column(name="ds_lote",length=100,nullable=false)
	private String descricao;
	
	@Min(1)
	private int qtde_produtos;
	
	@Column(name="vl_total",nullable=false)
	@Digits(integer=12,fraction=2)
	@DecimalMin("2.00")
	private BigDecimal valor_total;
	
	@Column(name="vl_unitario",nullable=false)
	@Digits(integer=10,fraction=2)
	@DecimalMin("1.00")
	private BigDecimal valor_unitario;
	
	@Column(nullable=false)
	private LocalDate dt_vencimento;


	@JoinColumn(name="cd_entrada", referencedColumnName="cd_entrada")
	@ManyToOne
	private Entrada entrada;
	
	@JoinColumn(name="cd_produto",updatable=false)
	@ManyToOne
	private Produto produto;
	
	@JoinColumns({@JoinColumn(name="estoque_fk", referencedColumnName="cd_estoque",updatable =false),
		@JoinColumn(name="nr_estocado_fk", referencedColumnName="nr_estocado",updatable =false)})			
	@ManyToOne
	private Estoque estoque;

	public Entrada_Lote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entrada_Lote(String descricao, @Min(1) int qtde_produtos,
			@Digits(integer = 12, fraction = 2) @DecimalMin("2.00") BigDecimal valor_total,
			@Digits(integer = 10, fraction = 2) @DecimalMin("1.00") BigDecimal valor_unitario, LocalDate dt_vencimento,
			Entrada entrada, Produto produto, Estoque estoque) {
		super();
		this.descricao = descricao;
		this.qtde_produtos = qtde_produtos;
		this.valor_total = valor_total;
		this.valor_unitario = valor_unitario;
		this.dt_vencimento = dt_vencimento;
		this.entrada = entrada;
		this.produto = produto;
		this.estoque = estoque;
	}

	public long getCd_lote() {
		return cd_lote;
	}

	public void setCd_lote(long cd_lote) {
		this.cd_lote = cd_lote;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtde_produtos() {
		return qtde_produtos;
	}

	public void setQtde_produtos(int qtde_produtos) {
		this.qtde_produtos = qtde_produtos;
	}

	public BigDecimal getValor_total() {
		return valor_total;
	}

	public void setValor_total(BigDecimal valor_total) {
		this.valor_total = valor_total;
	}

	public BigDecimal getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(BigDecimal valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public LocalDate getDt_vencimento() {
		return dt_vencimento;
	}

	public void setDt_vencimento(LocalDate dt_vencimento) {
		this.dt_vencimento = dt_vencimento;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
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
