package com.felicidade.sistema.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Embeddable
public class TelefonePK implements Serializable{

	private long cd_telefone;
	private AfiliadaPK afiliada_id;
	
	
	public long getCd_telefone() {
		return cd_telefone;
	}
	public void setCd_telefone(long cd_telefone) {
		this.cd_telefone = cd_telefone;
	}
	public AfiliadaPK getAfiliada_id() {
		return afiliada_id;
	}
	public void setAfiliada_id(AfiliadaPK afiliada_id) {
		this.afiliada_id = afiliada_id;
	}
	public TelefonePK(long cd_telefone, AfiliadaPK afiliada_id) {
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
		result = prime * result + (int) (cd_telefone ^ (cd_telefone >>> 32));
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
		if (cd_telefone != other.cd_telefone)
			return false;
		return true;
	}
	
	
	
	
}
