package com.algafoodapi2.algafoodapi2.Notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.model.Cliente;

@Primary
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do email %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}
