package com.felicidade.sistema.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class AfiliadaPK implements Serializable {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cd_transportadora;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cd_afiliada;
	
	public AfiliadaPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AfiliadaPK(Long cd_transportadora, Long cd_afiliada) {
		super();
		this.cd_transportadora = cd_transportadora;
		this.cd_afiliada = cd_afiliada;
	}
	public Long getCd_transportadora() {
		return cd_transportadora;
	}
	public void setCd_transportadora(Long cd_transportadora) {
		this.cd_transportadora = cd_transportadora;
	}
	public Long getCd_afiliada() {
		return cd_afiliada;
	}
	public void setCd_afiliada(Long cd_afiliada) {
		this.cd_afiliada = cd_afiliada;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_afiliada == null) ? 0 : cd_afiliada.hashCode());
		result = prime * result + ((cd_transportadora == null) ? 0 : cd_transportadora.hashCode());
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
		AfiliadaPK other = (AfiliadaPK) obj;
		if (cd_afiliada == null) {
			if (other.cd_afiliada != null)
				return false;
		} else if (!cd_afiliada.equals(other.cd_afiliada))
			return false;
		if (cd_transportadora == null) {
			if (other.cd_transportadora != null)
				return false;
		} else if (!cd_transportadora.equals(other.cd_transportadora))
			return false;
		return true;
	}
	
	
}
