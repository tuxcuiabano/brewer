package com.tuxcuiabano.brewer3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrosController {

	@GetMapping("/404")
	public String paginaNaoEncontrada() {
		return "404";
	}
	
	@PostMapping("/500")
	public String erroServidor() {
		return "500";
	}
	
}