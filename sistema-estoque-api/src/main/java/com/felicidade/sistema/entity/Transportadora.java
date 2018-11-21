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


@Entity
@Table(name="TB_FELICIDADE_TRANSPORTADORA")
@Inheritance(strategy = InheritanceType.JOINED ) // Herança usando a estratégia JOINED
public class Transportadora implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cd_transportadora;

	@Column(name="ds_nome",length=50,nullable=false)
	private String nome;
	
	@Column(name="nr_ddd",length=15,nullable=false)
	private int cnpj;

	@OneToMany(mappedBy="transportadora", cascade= {CascadeType.REMOVE,CascadeType.REFRESH})
	private List<Transportadora_afiliada> afiliadas;
	
}
