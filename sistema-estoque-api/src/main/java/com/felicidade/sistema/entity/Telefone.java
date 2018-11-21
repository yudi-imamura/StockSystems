package com.felicidade.sistema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="TB_FELICIDADE_TELEFONE")
public class Telefone implements Serializable {
	
	@EmbeddedId
	private TelefonePK id_telefone;
	
	@Column(name="nr_ddd",length=3,nullable=false)
	private int ddd;
	
	@Column(length=9,nullable=false)
	private int nr_telefone;

	@MapsId("afiliada_id")
	@JoinColumns({@JoinColumn(name="tranportadora_id", referencedColumnName="cd_transportadora"),
		@JoinColumn(name="afiliada_id", referencedColumnName="cd_afiliada")})			
	@ManyToOne
	private Transportadora_afiliada afiliada;

	
	public TelefonePK getId_telefone() {
		return id_telefone;
	}
	public void setId_telefone(TelefonePK id_telefone) {
		this.id_telefone = id_telefone;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNr_telefone() {
		return nr_telefone;
	}
	public void setNr_telefone(int nr_telefone) {
		this.nr_telefone = nr_telefone;
	}
}
