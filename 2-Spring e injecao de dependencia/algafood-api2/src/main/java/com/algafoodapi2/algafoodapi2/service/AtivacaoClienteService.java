package com.algafoodapi2.algafoodapi2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.Notificacao.Notificador;
import com.algafoodapi2.algafoodapi2.model.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		if (notificador != null) {
			notificador.notificar(cliente, "seu cadastro no sistema esta ativo!");
		} else {
			System.out.println("não existe notificador, mas cliente foi ativado");
		}

	}

}