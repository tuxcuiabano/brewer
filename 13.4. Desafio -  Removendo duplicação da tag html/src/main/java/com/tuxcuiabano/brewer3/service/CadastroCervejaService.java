package com.tuxcuiabano.brewer3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tuxcuiabano.brewer3.model.Cerveja;
import com.tuxcuiabano.brewer3.repository.Cervejas;

@Service
public class CadastroCervejaService {

	@Autowired
	private Cervejas cervejas;
	
	@Transactional
	public void salvar(Cerveja cerveja) {
		
		cervejas.save(cerveja);
		
	}
	
	
}
