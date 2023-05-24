package br.com.fiap.dto;

import java.util.Calendar;

public class CachorroDTO {
	
	private String nome; 
	private String raca; 
	private String sexo; 
	private Calendar dataCadastro; 
	private Calendar dataAtualizacao;
	
	public CachorroDTO(CachorroDTO entity) {
		this.nome = entity.getNome();
		this.raca = entity.getRaca();
		this.sexo = entity.getSexo();
		this.dataCadastro = entity.getDataCadastro();
		this.dataAtualizacao = entity.getDataAtualizacao();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	

}
