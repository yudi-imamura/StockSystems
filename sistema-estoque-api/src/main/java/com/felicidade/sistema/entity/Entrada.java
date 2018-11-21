package com.felicidade.sistema.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

import org.hibernate.annotations.Check;

@Entity
@Table(name="TB_FELICIDADE_ENTRADA")
@Check(constraints = "dt_entrada<dt_pedida")
public class Entrada implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cd_entrada;
	
	@Column(name="dt_pedida",nullable=false)
	private LocalDateTime dt_pedida;
	
	@Column(name="dt_entrada",nullable=false)
	private LocalDateTime dt_entrada;
	
	@Column(name="vl_total",nullable=false,precision=12,scale=2)
	@Digits(integer=12,fraction=2)
	@DecimalMin("10.00")
	private BigDecimal total;
	
	@Column(name="vl_frete",nullable=false,precision=10,scale=2)
	@Digits(integer=10,fraction=2)
	@DecimalMin("2.00")
	private BigDecimal frete;
	
	@Min(1)
	private int qntde_lote;
	
	@JoinColumns({@JoinColumn(name="cd_tranportadora", referencedColumnName="cd_transportadora"),
		@JoinColumn(name="cd_afiliada", referencedColumnName="cd_afiliada")})			
	@ManyToOne
	private Transportadora_afiliada transport_afiliada;

	@OneToMany(mappedBy="entrada", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Entrada_Lote> lotes;
}
