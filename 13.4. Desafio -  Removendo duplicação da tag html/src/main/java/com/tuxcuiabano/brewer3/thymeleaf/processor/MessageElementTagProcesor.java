package com.tuxcuiabano.brewer3.thymeleaf.processor;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IModelFactory;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

public class MessageElementTagProcesor extends AbstractElementTagProcessor{
	private static final String NOME_TAG = "message";
	private static final int PRECEDENCIA = 1000;
	
	public MessageElementTagProcesor(String dialectPrefix) {
		super(TemplateMode.HTML, dialectPrefix, NOME_TAG, true, null, false, PRECEDENCIA);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doProcess(ITemplateContext context, IProcessableElementTag tag,
			IElementTagStructureHandler structureHandler) {
		
		IModelFactory modelFactory = context.getModelFactory();
		
		IModel model = modelFactory.createModel();
		model.add(modelFactory.createStandaloneElementTag("th:block", "th:replace", "fragments/MensagemSucesso :: alert"));
		model.add(modelFactory.createStandaloneElementTag("th:block", "th:replace", "fragments/MensagensErroValidacao :: alert"));

		structureHandler.replaceWith(model, true);
		
	}

}
