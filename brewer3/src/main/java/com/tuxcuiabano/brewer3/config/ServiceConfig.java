package com.tuxcuiabano.brewer3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.tuxcuiabano.brewer3.service.CadastroCervejaService;
import com.tuxcuiabano.brewer3.storage.FotoStorage;
import com.tuxcuiabano.brewer3.storage.local.FotoStorageLocal;

@Configuration
@ComponentScan(basePackageClasses= CadastroCervejaService.class)
public class ServiceConfig {

	@Bean
	public FotoStorage fotoStorage() {
		return new FotoStorageLocal();
	}
	
}
