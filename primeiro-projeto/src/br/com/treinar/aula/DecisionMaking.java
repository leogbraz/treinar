package br.com.treinar.aula;

public class DecisionMaking {
	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		if (a > b) {
			System.out.println("a maior que b");
		} else {
			if (a < b) {
				System.out.println("a menor que b");
			} else {
				System.out.println("a e igual a b");
			}
		}
		int logica = 4;
		switch (logica) {
		case 1:
			System.out.println("Switch = Um");
			break;
		case 2:
			System.out.println("Switch = Dois");
			break;
		case 3:
			System.out.println("Switch = Tres");
			break;
		case 4:
			System.out.println("Switch = Quatro");
			break;
		case 5:
			System.out.println("Switch = Cinco");
			break;
		default:
			System.out.println("Switch = Fora do dominio 0 ~5");
			break;
		}
	}
}
