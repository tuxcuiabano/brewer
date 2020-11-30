package com.tuxcuiabano.brewer3.repository.filter;

import java.math.BigDecimal;

import com.tuxcuiabano.brewer3.model.Estilo;
import com.tuxcuiabano.brewer3.model.Origem;
import com.tuxcuiabano.brewer3.model.Sabor;

public class CervejaFilter {
	private String sku;
	private String nome;
	private Estilo estilo;
	private Sabor sabor;
	private Origem origem;
	private BigDecimal valorDe;
	private BigDecimal valorAte;
	
	public String getSku() {
		return sku;
	}
	public String getNome() {
		return nome;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public Sabor getSabor() {
		return sabor;
	}
	public Origem getOrigem() {
		return origem;
	}
	public BigDecimal getValorDe() {
		return valorDe;
	}
	public BigDecimal getValorAte() {
		return valorAte;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
	public void setOrigem(Origem origem) {
		this.origem = origem;
	}
	public void setValorDe(BigDecimal valorDe) {
		this.valorDe = valorDe;
	}
	public void setValorAte(BigDecimal valorAte) {
		this.valorAte = valorAte;
	}
	
	
	
	
}
