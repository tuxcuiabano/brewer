package com.tuxcuiabano.brewer3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuxcuiabano.brewer3.model.Cidade;
import com.tuxcuiabano.brewer3.model.Estado;
import com.tuxcuiabano.brewer3.repository.helper.cidade.CidadesQueries;

public interface Cidades extends JpaRepository<Cidade, Long>, CidadesQueries {

	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

	public Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);

	
}