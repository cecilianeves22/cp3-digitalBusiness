package br.com.fiap.entity;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="dogs") 
public class CachorroEntity { 
	
	@Column(name="nome_dog")
	private String nome; 
	@Column(name="raca_dog") 
	private String raca; 
	@Column(name="sexo_dog") 
	private String sexo; 
	@Column(name="data_cadastro") 
	private Calendar dataCadastro; 
	@Column(name="data_atualizacao") 
	private Calendar dataAtualizacao; 
	
	public CachorroEntity() {} 
	
	public CachorroEntity(String nome, String raca, String sexo, Calendar dataCadastro, Calendar dataAtualizacao) {
		super(); 
		this.nome = nome; 
		this.raca = raca; 
		this.sexo = sexo; 
		this.dataCadastro = dataCadastro; 
		this.dataAtualizacao = dataAtualizacao; 
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public String getSexo() {
		return sexo;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}
}
