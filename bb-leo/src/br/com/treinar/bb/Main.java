package br.com.treinar.bb;

import java.util.Scanner;

import br.com.treinar.bb.model.Conta;

public class Main {

	static Scanner input = new Scanner(System.in);// API padrão para captura do teclado
	public static void main(String[] args) {
		int opcao;
		do {
			imprimirMenu();
			opcao = input.nextInt();// Aguarda algum digito
			switch (opcao) {
			case 1:
				criarConta();
				break;
			case 2:
				System.out.println("DEPOSITAR");
				break;
			case 0:
				System.out.println("VALEU!");
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA. DIGITE NOVAMENTE");
				break;
			}
		} while (opcao != 0);
		System.out.println("good-by");

		input.close();// Encerra o "input.close" para economizar memoria
	}

	private static void criarConta() {
		Conta c = new Conta();
		System.out.print("Informe o numero: ");
		c.numero = input.nextInt();
	}

	private static void imprimirMenu() {
		System.out.print(""
				+ "Informe a opção: \n"
				+ "\t0 - Sair\n"
				+ "\t1 - Criar Conta\n"
				+ "\t\n=>"
				);
	}

}
