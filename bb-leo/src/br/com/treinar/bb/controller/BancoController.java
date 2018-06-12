package br.com.treinar.bb.controller;

import br.com.treinar.bb.model.banco.Conta;
import br.com.treinar.bb.model.banco.ContaCorrente;
import br.com.treinar.bb.model.banco.ContaPoupanca;
import br.com.treinar.bb.model.banco.ContaSalario;

public class BancoController {

	private Conta conta;

	public void criarConta(ContaCorrente contaCorrente) {
		System.out.println();
	}
	public void criarConta(ContaPoupanca contaPoupanca) {
		System.out.println();
	}
	public void criarConta(ContaSalario contaSalario) {
		System.out.println();
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void depositar(double valor) {
		conta.depositar(valor);
	}
}
