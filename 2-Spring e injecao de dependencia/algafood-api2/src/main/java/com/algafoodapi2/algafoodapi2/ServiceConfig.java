package com.algafoodapi2.algafoodapi2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algafoodapi2.algafoodapi2.Notificacao.Notificador;
import com.algafoodapi2.algafoodapi2.service.AtivacaoClienteService;

//@Configuration
public class ServiceConfig {
 
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService();
	}
}
