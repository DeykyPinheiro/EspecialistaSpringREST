package com.algafoodapi2.algafoodapi2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algafoodapi2.algafoodapi2.Notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("Smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
}
