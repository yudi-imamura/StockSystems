package com.felicidade.sistema.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;


@Entity
@Table(name="TB_FELICIDADE_TRANSPORTADORA",
uniqueConstraints = {@UniqueConstraint(columnNames="nr_cnpj")})
@Inheritance(strategy = InheritanceType.JOINED ) // Herança usando a estratégia JOINED
public class Transportadora implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cd_transportadora;

	@Column(name="ds_nome",length=50,nullable=false)
	private String nome;
	
	@Column(name="nr_cnpj",length=15,nullable=false)
	private long cnpj;

	@OneToMany(mappedBy="transportadora", cascade= {CascadeType.REMOVE,CascadeType.REFRESH})
	private List<Transportadora_afiliada> afiliadas;

	
	
	public long getCd_transportadora() {
		return cd_transportadora;
	}

	public void setCd_transportadora(long cd_transportadora) {
		this.cd_transportadora = cd_transportadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public Transportadora(String nome, @Digits(integer = 15, fraction = 0) long cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Transportadora() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
