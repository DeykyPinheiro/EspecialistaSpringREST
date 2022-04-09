package com.algafoodapi2.algafoodapi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algafoodapi2.algafoodapi2.model.Cliente;
import com.algafoodapi2.algafoodapi2.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("chamei o meu primeiro controler");
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("joao", "joao@email.com", "11987645321");
		ativacaoClienteService.ativar(joao);
		return "Hello motherfucker!";
	}
}
