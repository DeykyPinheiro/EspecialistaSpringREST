package com.algaworks.di;

import com.algaworks.di.model.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;

import service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {

		Cliente joao = new Cliente("joao", "joao@gmail.com", "11123456789");
		Cliente maria = new Cliente("maria", "maria@gmail.com", "11123456789");
		Cliente jose = new Cliente("jose", "jose@gmail.com", "11123456789");

		Notificador notificador = new NotificadorSMS();

		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
		ativacaoCliente.ativar(jose);
	}
}
