package com.tuxcuiabano.brewer3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuxcuiabano.brewer3.model.Cliente;
import com.tuxcuiabano.brewer3.repository.helper.cliente.ClientesQueries;

public interface Clientes extends JpaRepository<Cliente, Long> , ClientesQueries{

	public Optional<Cliente> findByCpfOuCnpj(String cpfOuCnpj);

	public List<Cliente> findByNomeStartingWithIgnoreCase(String nome);

}
