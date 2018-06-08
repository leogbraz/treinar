package br.com.treinar;

public class Conta {

	public int numero;
	public double saldo;
	public Cliente cliente;

	public void sacar(double valor) { // Sem retorno
		if (valor <= saldo) {
			saldo = saldo - valor;
		}
		// Ou pra ficar mais bonito:
		// saldo -= valor;
	}

	public boolean sacarok(double valor) { // Com retorno
		boolean deuPraSacar = false;
		if (valor <= saldo) {
			saldo = saldo - valor;
			deuPraSacar = true;
		} else {
			deuPraSacar = false;
		}
		return deuPraSacar;

	}

	public double consultaSaldo() {
		double consultaSaldo = saldo;
		return consultaSaldo;
	}
	
	public void depositar(double deposito) {
		saldo += deposito;
	}

}