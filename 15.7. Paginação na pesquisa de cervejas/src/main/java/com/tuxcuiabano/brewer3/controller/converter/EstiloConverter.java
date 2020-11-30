package com.tuxcuiabano.brewer3.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.tuxcuiabano.brewer3.model.Estilo;

public class EstiloConverter implements Converter<String, Estilo> {

	@Override
	public Estilo convert(String codigo) {
		
		// se não fizer esse IF, o Estilo dará problemas se o usuário quiser enviar o formulario sem escolher estilo, por causa da conversao
		if (!StringUtils.isEmpty(codigo)) {
			Estilo estilo = new Estilo();
			estilo.setCodigo(Long.valueOf(codigo));
			return estilo;
		}
		
		return null;
	}

}
