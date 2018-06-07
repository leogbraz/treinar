package br.com.treinar;

import br.com.treinar.aula.pessoa.Pessoa;

public class TesteObjeto {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.numero = 123456;
		c.saldo = 1000;
		c.cliente = new Cliente();
		c.cliente.nome = "Cliente";

	}
}
