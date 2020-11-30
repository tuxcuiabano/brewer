package com.tuxcuiabano.brewer3.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.tuxcuiabano.brewer3.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.tuxcuiabano.brewer3.thymeleaf.processor.MenuAttributeTagProcessor;
import com.tuxcuiabano.brewer3.thymeleaf.processor.MessageElementTagProcesor;
import com.tuxcuiabano.brewer3.thymeleaf.processor.OrderElementTagProcessor;
import com.tuxcuiabano.brewer3.thymeleaf.processor.PaginationElementTagProcessor;

public class BrewerDialect extends AbstractProcessorDialect {

	public BrewerDialect(){
		super("Tuxcuiabano Brewer", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
		
	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcesor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		processadores.add(new MenuAttributeTagProcessor(dialectPrefix));
		return processadores;
	}

}
