package com.tuxcuiabano.brewer3.repository.helper.cliente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tuxcuiabano.brewer3.model.Cliente;
import com.tuxcuiabano.brewer3.repository.filter.ClienteFilter;

public interface ClientesQueries {

	public Page<Cliente> filtrar(ClienteFilter filtro, Pageable pageable);
	
}