package com.felicidade.sistema.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class TelefonePK implements Serializable{

	private Long cd_telefone;
	private AfiliadaPK afiliada_id;
	
	
	public Long getCd_telefone() {
		return cd_telefone;
	}
	public void setCd_telefone(Long cd_telefone) {
		this.cd_telefone = cd_telefone;
	}
	public AfiliadaPK getAfiliada_id() {
		return afiliada_id;
	}
	public void setAfiliada_id(AfiliadaPK afiliada_id) {
		this.afiliada_id = afiliada_id;
	}
	public TelefonePK(Long cd_telefone, AfiliadaPK afiliada_id) {
		super();
		this.cd_telefone = cd_telefone;
		this.afiliada_id = afiliada_id;
	}
	public TelefonePK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((afiliada_id == null) ? 0 : afiliada_id.hashCode());
		result = prime * result + ((cd_telefone == null) ? 0 : cd_telefone.hashCode());
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
		TelefonePK other = (TelefonePK) obj;
		if (afiliada_id == null) {
			if (other.afiliada_id != null)
				return false;
		} else if (!afiliada_id.equals(other.afiliada_id))
			return false;
		if (cd_telefone == null) {
			if (other.cd_telefone != null)
				return false;
		} else if (!cd_telefone.equals(other.cd_telefone))
			return false;
		return true;
	}
	
	
	
	
}
