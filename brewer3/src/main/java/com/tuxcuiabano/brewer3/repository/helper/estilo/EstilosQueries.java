package com.tuxcuiabano.brewer3.repository.helper.estilo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tuxcuiabano.brewer3.model.Estilo;
import com.tuxcuiabano.brewer3.repository.filter.EstiloFilter;

public interface EstilosQueries {
	
	public Page<Estilo> filtrar(EstiloFilter filtro, Pageable pageable);
	
}