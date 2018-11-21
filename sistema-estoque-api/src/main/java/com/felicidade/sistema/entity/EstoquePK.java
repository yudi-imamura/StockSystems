package com.felicidade.sistema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Pattern;

@Embeddable
public class EstoquePK implements Serializable{

	@Column(name="cd_estoque")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cd_estoque;

	@Column(name="nr_estocado")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long nr_estocado;

	public EstoquePK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstoquePK(long cd_estoque, long nr_estocado) {
		super();
		this.cd_estoque = cd_estoque;
		this.nr_estocado = nr_estocado;
	}
	
	

	public long getCd_estoque() {
		return cd_estoque;
	}

	public void setCd_estoque(long cd_estoque) {
		this.cd_estoque = cd_estoque;
	}

	public long getNr_estocado() {
		return nr_estocado;
	}

	public void setNr_estocado(long nr_estocado) {
		this.nr_estocado = nr_estocado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cd_estoque ^ (cd_estoque >>> 32));
		result = prime * result + (int) (nr_estocado ^ (nr_estocado >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstoquePK other = (EstoquePK) obj;
		if (cd_estoque != other.cd_estoque)
			return false;
		if (nr_estocado != other.nr_estocado)
			return false;
		return true;
	}

	
}
