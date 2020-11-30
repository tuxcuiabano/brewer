package com.tuxcuiabano.brewer3.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.tuxcuiabano.brewer3.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.tuxcuiabano.brewer3.thymeleaf.processor.MessageElementTagProcesor;

public class BrewerDialect extends AbstractProcessorDialect {

	public BrewerDialect(){
		super("Tuxcuiabano Brewer", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
		
	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcesor(dialectPrefix));
		return processadores;
	}

}
