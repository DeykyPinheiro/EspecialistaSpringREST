package com.algafoodapi2.algafoodapi2.Notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.model.Cliente;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("contrutor Prod");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s atraves do email %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}
