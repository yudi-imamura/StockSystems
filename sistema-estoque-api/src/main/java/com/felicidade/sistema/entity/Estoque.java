package com.felicidade.sistema.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="TB_FELICIDADE_ESTOQUE")
public class Estoque implements Serializable {

	@EmbeddedId
	private EstoquePK id_estoque;
	
	@Column(name="nr_etiqueta",nullable = false , unique=true)
	@Pattern(regexp="\\d{4}-\\d{4}-\\d{4}", message="Você deve informar no seguinte formato 0000-0000-0000")
	private String nr_etiqueta;
	
	@OneToMany(mappedBy="estoque",cascade = CascadeType.PERSIST)
	private List<Entrada_Lote> entradas;

	@OneToMany(mappedBy="estoque",cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	private List<Saida> saidas;

	
	public Estoque(
			@Pattern(regexp = "\\d{4}-\\d{4}-\\d{4}", message = "Você deve informar no seguinte formato 0000-0000-0000") String nr_etiqueta,
			List<Entrada_Lote> entradas, List<Saida> saidas) {
		super();
		this.nr_etiqueta = nr_etiqueta;
		this.entradas = entradas;
		this.saidas = saidas;
	}
	public Estoque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstoquePK getId_estoque() {
		return id_estoque;
	}
	public void setId_estoque(EstoquePK id_estoque) {
		this.id_estoque = id_estoque;
	}
	public String getNr_etiqueta() {
		return nr_etiqueta;
	}
	public void setNr_etiqueta(String nr_etiqueta) {
		this.nr_etiqueta = nr_etiqueta;
	}
	public List<Entrada_Lote> getEntradas() {
		return entradas;
	}
	public void setEntradas(List<Entrada_Lote> entradas) {
		this.entradas = entradas;
	}
	public List<Saida> getSaidas() {
		return saidas;
	}
	public void setSaidas(List<Saida> saidas) {
		this.saidas = saidas;
	}
	
	
}
