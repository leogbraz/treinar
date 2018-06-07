package br.com.treinar.aula.pessoa;

public class ChamaPessoa {

	public static void main(String[] args) {
		Pessoa fulano = new Pessoa();
		fulano.nome = "fulano";
		System.out.println("Nome da pessoa: " + fulano.nome);
		Pessoa ciclano = fulano;

		ciclano.nome = "ciclano";
		System.out.println("Nome da pessoa: " + fulano.nome);

		Pessoa beltrano = fulano;
		beltrano.nome = "beltrano";
		System.out.println("Nome da pessoa: " + fulano.nome);

		Pessoa outra = new Pessoa();
		outra.nome = "outra pessoa";
		System.out.println("Nome da pessoa: " + outra.nome);

		fulano.nome = "teste";
		System.out.println("Nome da pessoa: " + fulano.nome);

	}
}
