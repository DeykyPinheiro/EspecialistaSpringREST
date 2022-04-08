package com.algafoodapi2.algafoodapi2.Notificacao;

import org.springframework.stereotype.Component;

import com.algafoodapi2.algafoodapi2.model.Cliente;

@Component
public class NotificadorEmail {
	
//	o spring faz a instanciacao no inicio por isso coloquei esse construtor
//	NotificadorEmail(){
//		System.out.println("Chamei o construtor");
//	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
