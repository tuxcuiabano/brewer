package com.tuxcuiabano.brewer3.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {

	@NotBlank(message= "Nome é obrigatório")
	private String nome;
	@NotBlank(message= "Tipo de Pessoa é obrigatório")
	private String tipoPessoa;
	@Size(min = 1, message= "Descrição deve pelo menos 1 caracter")
	private String cpfCnpj;
	@NotBlank(message= "Telefone é obrigatório")
	private String telefone;
	@NotBlank(message= "Email é obrigatório")
	private String email;
	@NotBlank(message= "Logradouro é obrigatório")
	private String logradouro;
	@NotBlank(message= "Número é obrigatório")
	private String numero;
	private String complemento;
	@NotBlank(message= "CEP é obrigatório")
	private String cep;
	@NotBlank(message= "Estado é obrigatório")
	private String estado;
	@NotBlank(message= "Cidade é obrigatório")
	private String cidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
	
}
