package com.tuxcuiabano.brewer3.repository.helper.cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tuxcuiabano.brewer3.model.Cidade;
import com.tuxcuiabano.brewer3.repository.filter.CidadeFilter;

public interface CidadesQueries {

	public Page<Cidade> filtrar(CidadeFilter filtro, Pageable pageable);
	
}
