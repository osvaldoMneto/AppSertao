package com.digitalolk.appOsvaldo.model.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Artista {
	
	@Id     // para declarar que o id é uma chave primaria.
	@GeneratedValue(strategy = GenerationType.IDENTITY)// para autoincremento
	private Integer id;
	@ManyToOne
	private Usuario usuario;
	private String nome; // Luis Gonzaga
	private String siglaCidade; //EXU- O proprio banco de Dados entendera o kamilcase e adicionara Sigla_cidade
	private boolean inmomoria; //true
	public  float valor; // 200.
	
	
	public Artista() {
		this.nome = "";
		this.siglaCidade = "";
		this.valor = 300;
		
		
	}
	
	public Artista(String nome, String siglaCidade) {
		this.nome = nome;
		this.siglaCidade = siglaCidade;
	}

	  
	  
	@Override
	public String toString() {
		return "Artista "+nome+" da cidade de "+siglaCidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSiglaCidade() {
		return siglaCidade;
	}
	public void setSiglaCidade(String siglaCidade) {
		this.siglaCidade = siglaCidade;
	}
	public boolean isinmomoria() {
		return inmomoria;
	}
	public void setDiscos(boolean inmemoria) {
		this.inmomoria = inmemoria;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isInmomoria() {
		return inmomoria;
	}

	public void setInmomoria(boolean inmomoria) {
		this.inmomoria = inmomoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
