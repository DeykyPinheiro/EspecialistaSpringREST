package com.algafoodapi2.algafoodapi2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.Notificacao.NivelUrgencia;
import com.algafoodapi2.algafoodapi2.Notificacao.Notificador;
import com.algafoodapi2.algafoodapi2.Notificacao.TipoDoNotificador;
import com.algafoodapi2.algafoodapi2.model.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	private Notificador notificador;
 
	public void ativar(Cliente cliente) {
		cliente.ativar();

			notificador.notificar(cliente, "seu cadastro no sistema esta ativo!");

		}

	}

