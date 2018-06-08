package br.com.treinar;

import br.com.treinar.aula.pessoa.Pessoa;

public class TesteObjeto {
	public static void main(String[] args) {
		Conta c = new Conta(); // Chama classe "Conta" e instancia um objeto "Conta"
		c.numero = 272287;// Atribui à posição "número" de c o valor 27228-7
		c.saldo = 1000; // Atribui 1000 no "campus" saldo de c
		c.cliente = new Cliente(); // Instancia um novo cliente dentro do campus cliente de c
		c.cliente.nome = "Leonardo Bráz";// Atribui o nome Leo... ao campus nome de cliente dentro de c
		c.cliente.cpf = "015.283.546-92";
		System.out.println("       BANCO DO BRASIL- SA");
		System.out.println("DADOS DA CONTA CORRENTE: " + c.numero);
		System.out.println("CLIENTE: " + c.cliente.nome);
		System.out.println("CPF: " + c.cliente.cpf);
		System.out.println("Saldo: R$" + c.saldo);

		Conta d = new Conta();
		d.numero = 103458;
		d.saldo = 100;
		d.cliente = new Cliente();
		d.cliente.nome = "Shirley Bráz";
		d.cliente.cpf = "029.298.998-09";

		System.out.println("\nDADOS DA CONTA CORRENTE: " + d.numero);
		System.out.println("CLIENTE: " + d.cliente.nome);
		System.out.println("CPF: " + d.cliente.cpf);
		System.out.println("Saldo: R$" + d.saldo);
		// Tenta acessar memoria não instanciada... retornara erro, pois não foi
		// atribuido nada na nova Conta e
		// Conta e = new Conta();
		// System.out.println(e.cliente);
		System.out.println("\nFazer saque de R$50,00 na conta de Shirley");
		d.sacar(50);
		System.out.println("Saldo final: R$ " + d.saldo);

		System.out.println("Fazer saque de R$50,00 na conta de Leonardo");
		c.sacar(50);
		System.out.println("Saldo final: R$ " + c.saldo);

		System.out.println("Fazer saque de R$50,00 na conta de Leonardo novamente");
		c.sacar(50);
		System.out.println("Saldo final: R$ " + c.saldo);
		System.out.println("\nTESTE DE SAQUE SUPERIOR AO SALDO (R$5.000,00)");
		boolean sacou = c.sacarok(5000); // Fazer saque com teste de insuficiecia de saldo
		if (sacou) {
			System.out.println("Saldo: " + c.saldo);
		} else {
			System.out.println("Saldo insuficiente!");
			System.out.println("Você possui: R$" + c.saldo);
		}
		System.out.println("\nCONSULTAR SALDO");
		double saldoconsultado = c.consultaSaldo();
		System.out.println("O valor consultado é: R$" + saldoconsultado);
		
		System.out.println("\nDEPOSITAR VALOR R$10,00");
		c.depositar(10);
		
		System.out.println("Saldo anterior + deposito: R$" + c.consultaSaldo());
		
		c.sacar(10);
		System.out.println(c.saldo);
	}
}
