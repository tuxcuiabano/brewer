package com.tuxcuiabano.brewer3.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tuxcuiabano.brewer3.model.Cerveja;
import com.tuxcuiabano.brewer3.model.Estilo;
import com.tuxcuiabano.brewer3.model.Origem;
import com.tuxcuiabano.brewer3.model.Sabor;
import com.tuxcuiabano.brewer3.repository.Cervejas;
import com.tuxcuiabano.brewer3.repository.Estilos;
import com.tuxcuiabano.brewer3.service.CadastroCervejaService;

@Controller
public class CervejasController {
	
	//private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);
	
	@Autowired
	private Cervejas cervejas;
	
	@Autowired
	private Estilos estilos;
	
	@Autowired
	
	private CadastroCervejaService cadastroCervejaService;

	@RequestMapping("/cervejas/novo")
	public ModelAndView novo(Cerveja cerveja){
	//logger.error("Aqui é um log de erro");	
	//logger.info("Aqui é um log de info");
		
	ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");	
	mv.addObject("sabores", Sabor.values());
	mv.addObject("estilos", estilos.findAll());
	mv.addObject("origens", Origem.values());
	cervejas.findAll();//apagar
		
	//	model.addAttribute(new Cerveja());retirado antes era public String novo(Model model){
		return mv ;
	}

	@RequestMapping(value= "/cervejas/novo", method= RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes){
		

		if(result.hasErrors()) {
			model.addAttribute(cerveja); //mantem os dados ja digitados no formulario
		//	model.addAttribute("mensagem", "Erro no formulário"); - mostrando erro antigo 2o
		//	System.out.println(">>>>ERRO"); mensagem de teste 1o
			//return "cerveja/CadastroCerveja"; //antigo retorno 3o
			return novo(cerveja);
		}
		
		
		
		
		//aqui foi redirect - faz redirecionamento para url, nova requisição
		
		cadastroCervejaService.salvar(cerveja);
		attributes.addFlashAttribute("mensagem","Cerveja salva com sucesso");
		System.out.println("Sku:" + cerveja.getSku());
		System.out.println("Sabor:" + cerveja.getSabor());
		if(cerveja.getEstilo()!= null)
		System.out.println("Estilo:" + cerveja.getEstilo().getCodigo());
		return new ModelAndView("redirect:/cervejas/novo");
		
	}
	

	
	
}
