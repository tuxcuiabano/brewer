package com.tuxcuiabano.brewer3.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.tuxcuiabano.brewer3.model.Cidade;

public class CidadeConverter implements Converter<String, Cidade> {

	
	
	@Override
	public Cidade convert(String codigo) {
		if (!StringUtils.isEmpty(codigo)) {
			Cidade cidade = new Cidade();
			cidade.setCodigo(Long.valueOf(codigo));
			return cidade;
		}
		
		return null;
	}

}