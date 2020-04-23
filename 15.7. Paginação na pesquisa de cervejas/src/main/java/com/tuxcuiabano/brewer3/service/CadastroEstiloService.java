package com.tuxcuiabano.brewer3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tuxcuiabano.brewer3.model.Estilo;
import com.tuxcuiabano.brewer3.repository.Estilos;
import com.tuxcuiabano.brewer3.service.exception.NomeEstiloCadastradoException;

@Service
public class CadastroEstiloService {

	@Autowired
	private Estilos estilos;
	
	@Transactional
	public Estilo salvar(Estilo estilo) {
		Optional<Estilo> estiloOptional = estilos.findByNomeIgnoreCase(estilo.getNome());
		if (estiloOptional.isPresent()) {
			throw new NomeEstiloCadastradoException("Nome do estilo já cadastrado");
		}
		
		return estilos.saveAndFlush(estilo);
	}
	
}
