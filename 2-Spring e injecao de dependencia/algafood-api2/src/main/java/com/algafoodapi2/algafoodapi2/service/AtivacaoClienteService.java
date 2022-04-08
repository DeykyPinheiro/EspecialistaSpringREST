package com.algafoodapi2.algafoodapi2.service;

import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.Notificacao.NotificadorEmail;
import com.algafoodapi2.algafoodapi2.model.Cliente;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "seu cadastro no sistema esta ativo!");
	}

}