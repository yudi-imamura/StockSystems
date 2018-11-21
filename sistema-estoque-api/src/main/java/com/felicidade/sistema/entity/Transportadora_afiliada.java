package com.felicidade.sistema.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="TB_FELICIDADE_TRANSPORTADORA_AFILIADA")
public class Transportadora_afiliada implements Serializable{

	@EmbeddedId
	private AfiliadaPK cd_afiliada;
	
	@Column(length=150,nullable=false)
	private String ds_endereco;
	
	@Column(length=6,nullable=false)
	private int numero;
	
	@Column(name="ds_bairro",length=100,nullable=false)
	private String bairro;
	
	@Column(name="nr_cep",length=11,nullable=false)
	private int cep;
	
	@Type(type="yes_no") //tipo booleano retorna sim ou nao
	private Boolean matriz;
	
	@JoinColumn(name="tb_felicidade_cidade_cd_cidade")
	@ManyToOne
	private Cidade cidade;
	
	@MapsId("cd_tranportadora")
	@JoinColumn(name="cd_transportadora")
	@ManyToOne
	private Transportadora transportadora;
	
	@OneToMany(mappedBy="afiliada",cascade = {CascadeType.REMOVE,CascadeType.REFRESH})
	private List<Telefone> telefones;

	@OneToMany(mappedBy="transport_afiliada")
	private List<Entrada> entrada_detalhes;

}
