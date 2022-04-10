package com.algafoodapi2.algafoodapi2.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.Notificacao.NivelUrgencia;
import com.algafoodapi2.algafoodapi2.Notificacao.Notificador;
import com.algafoodapi2.algafoodapi2.Notificacao.TipoDoNotificador;
import com.algafoodapi2.algafoodapi2.model.Cliente;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void ativar(Cliente cliente) {
		cliente.ativar();

//			nao vamos notificador pq nao é resposabilidade dessa classe
//			notificador.notificar(cliente, "seu cadastro no sistema esta ativo!");
//			vamos disparar um evento dizendo que o cliente está ativo
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
		

	}

}
