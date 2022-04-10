package com.algafoodapi2.algafoodapi2.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.Notificacao.NivelUrgencia;
import com.algafoodapi2.algafoodapi2.Notificacao.Notificador;
import com.algafoodapi2.algafoodapi2.Notificacao.TipoDoNotificador;
import com.algafoodapi2.algafoodapi2.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo");
	}

}
