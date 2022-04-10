package com.algafoodapi2.algafoodapi2.service;

import com.algafoodapi2.algafoodapi2.model.Cliente;

public class ClienteAtivadoEvent {

	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
