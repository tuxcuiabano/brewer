package com.tuxcuiabano.brewer3.repository.helper.cerveja;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tuxcuiabano.brewer3.dto.CervejaDTO;
import com.tuxcuiabano.brewer3.model.Cerveja;
import com.tuxcuiabano.brewer3.repository.filter.CervejaFilter;

public interface CervejasQueries {
	
	public Page<Cerveja> filtrar(CervejaFilter filtro, Pageable pageable);
	public List<CervejaDTO> porSkuOuNome(String skuOuNome);

}
