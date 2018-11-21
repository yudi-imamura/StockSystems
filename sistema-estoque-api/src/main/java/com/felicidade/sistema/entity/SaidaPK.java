package com.felicidade.sistema.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class SaidaPK implements Serializable{

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cd_saida;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cd_produto;
	
	public long getCd_saida() {
		return cd_saida;
	}
	public void setCd_saida(long cd_saida) {
		this.cd_saida = cd_saida;
	}
	public long getCd_produto() {
		return cd_produto;
	}
	public void setCd_produto(long cd_produto) {
		this.cd_produto = cd_produto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cd_produto ^ (cd_produto >>> 32));
		result = prime * result + (int) (cd_saida ^ (cd_saida >>> 32));
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
		SaidaPK other = (SaidaPK) obj;
		if (cd_produto != other.cd_produto)
			return false;
		if (cd_saida != other.cd_saida)
			return false;
		return true;
	}
	
	
}
