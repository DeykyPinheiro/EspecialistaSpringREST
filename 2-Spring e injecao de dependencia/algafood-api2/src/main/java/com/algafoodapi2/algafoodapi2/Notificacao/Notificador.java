package com.algafoodapi2.algafoodapi2.Notificacao;

import com.algafoodapi2.algafoodapi2.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}