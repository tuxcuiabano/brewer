package com.tuxcuiabano.brewer3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.tuxcuiabano.brewer3.service.CadastroCervejaService;

@Configuration
@ComponentScan(basePackageClasses= CadastroCervejaService.class)
public class ServiceConfig {


	
	
}
