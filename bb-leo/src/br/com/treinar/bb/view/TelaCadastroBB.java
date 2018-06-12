package br.com.treinar.bb.view;

import java.util.Scanner;

import br.com.treinar.bb.controller.BancoController;
import br.com.treinar.bb.model.Cliente;
import br.com.treinar.bb.model.banco.ContaCorrente;
import br.com.treinar.bb.model.banco.ContaPoupanca;
import br.com.treinar.bb.model.banco.ContaSalario;

public class TelaCadastroBB {

	private BancoController controller;
	private Scanner input;

	public TelaCadastroBB() {
		controller = new BancoController();
		input = new Scanner(System.in);
	}

	public void iniciarOperacao() {
		int opcao;
		do {
			imprimirMenu();
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				criarConta();
				break;
			case 2:
				depositar();
				break;
			case 3:
				imprimirSaldo();
				break;
			case 0:
				break;

			default:
				System.out.println("OPÇÃO INVÁLIDA DIGITE NOVAMENTE");
				break;
			}
		} while (opcao != 0);

		input.close();

	}

	private void criarConta() {
		System.out.print("Digite: \n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Conta Salario");
		int opcao = input.nextInt();
		input.nextLine();
		System.out.print("Informe o numero da conta: ");
		int numeroConta = input.nextInt();
		System.out.print("Informe o nome do cliente: ");
		String nomeCliente = input.nextLine();
		System.out.print("Informe o cpf do cliente: ");
		String cpfCliente = input.nextLine();
		switch (opcao) {
		case 1:
			System.out.print("Informe o limite de credito");
			double limiteCredito = input.nextDouble();
			ContaCorrente cc = new ContaCorrente();
			cc.setCliente(new Cliente());
			cc.getCliente().setNome(nomeCliente);
			cc.getCliente().setCpf(cpfCliente);
			cc.setNumero(numeroConta);
			cc.setLimiteCredito(limiteCredito);
			controller.criarConta(cc);
			break;
		case 2:
			System.out.print("Informe o limite de credito");
			double taxaRendimento = input.nextFloat();
			ContaPoupanca cp = new ContaPoupanca();
			cp.setCliente(new Cliente());
			cp.getCliente().setNome(nomeCliente);
			cp.getCliente().setCpf(cpfCliente);
			cp.setNumero(numeroConta);
			cp.setTaxaRendimento(taxaRendimento);
			controller.criarConta(cp);
			controller.criarConta(contaPoupanca);
			break;
		case 3:
			System.out.print("Informe o dia de credito do salario");
			int diaCreditoSalario = input.nextInt();
			ContaSalario cs = new ContaSalario();
			cs.setCliente(new Cliente());
			cs.getCliente().setNome(nomeCliente);
			cs.getCliente().setCpf(cpfCliente);
			cs.setNumero(numeroConta);
			cs.setDiaCreditoSalario(diaCreditoSalario);
			controller.criarConta(cs);

			break;

		default:
			break;
		}
	}

	private void imprimirSaldo() {
		System.out.println("Saldo atual: " + controller.getConta().getSaldo());
	}

	private void depositar() {
		System.out.print("Valor a ser depositado: ");
		controller.depositar(input.nextDouble());
	}

	private static void imprimirMenu() {
		System.out.print("" + "Informe a opcão:\n" + "\t0 - Sair\n" + "\t1 - Criar Conta\n" + "\t2 - Depositar\n"
				+ "\t3 - Consulta Saldo\n" + "\t\n=> ");
	}

}
