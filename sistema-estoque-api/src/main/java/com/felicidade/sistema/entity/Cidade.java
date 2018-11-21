package com.felicidade.sistema.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_FELICIDADE_CIDADE")
public class Cidade {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cidadeId;
	
	@Column(name="ds_cidade",length=150,nullable=false)
	private String nome;

	@Column(name="ds_uf",length=2,nullable=false)
	private char uf;
	
	@OneToMany(mappedBy="cidade")
	private List<Transportadora_afiliada> transportadoras;
	
	public int getCidadeId() {
		return cidadeId;
	}
	public void setCidadeId(int cidadeId) {
		this.cidadeId = cidadeId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getUf() {
		return uf;
	}
	public void setUf(char uf) {
		this.uf = uf;
	}
	
	
}
