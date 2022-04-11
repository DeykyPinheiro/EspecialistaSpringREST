package com.algafoodapi2.algafoodapi2.Notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.model.Cliente;


@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	@Value("${notificador.email.host-servidor}")
	private String host;
	
	@Value("{notificador.email.porta-servidor}")
	private Integer porta;
	
	

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("host: "+ host);
		System.out.println("porta: "+ porta);
		
		System.out.printf("Notificando %s atraves do email %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}
