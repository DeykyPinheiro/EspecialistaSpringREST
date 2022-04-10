package com.algafoodapi2.algafoodapi2.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.model.Cliente;

@Component
public class EmissaoNotaFisacalService {

	private Cliente cliente;
	
	@EventListener
	public void ClienteAtivadoEvent(ClienteAtivadoEvent event) {
		System.out.printf("Emitindo nota fiscal para cliente: %s", event.getCliente().getNome());
	}

}
