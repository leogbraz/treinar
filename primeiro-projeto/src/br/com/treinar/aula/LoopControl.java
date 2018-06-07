package br.com.treinar.aula;

public class LoopControl {
	public static void main(String[] args) {
		int cont = 0;
		System.out.println("while");
		while (cont < 10) {
			System.out.println(++cont);// incrementa a variavel cont e imprime... quand ela for maior do que 10 o
										// "laço while" é encerrado.
		}

		System.out.println("\ndo while");
		do {
			System.out.println(cont--);
		} while (cont > 0);

		System.out.println("\nfor");
		for (int i = 0; i++ < 10;) {
			System.out.println(i);
			// i++;
		}
	}
}