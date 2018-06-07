package br.com.treinar.aula;

public class PrimeiraClasse {

	public static void main(String[] args) {
		String nome = "Leo Bráz";
		System.out.println(nome);
		// TRABALHANDO COM VARIAVEIS PRIMITIVAS
		byte a = 32;
		System.out.println("a = " + a);
		short b = 1986;
		System.out.println("b = " + b);

		int idade = 32;
		System.out.println("idade = " + idade);

		long numerogrande = 15283536;
		System.out.println("numero Grande = " + numerogrande);

		float numeroflutuante = (float) 3.14; // "Cast explicito" para informar que o numero 3.14 cabe como um numero
												// flutuante
												// o Cast pode ser feito assim tbm: 3.14f
		System.out.println("Numero Flutuante = " + numeroflutuante);

		boolean portaAberta = false;
		System.out.println("Porta = " + portaAberta);

		char A = 'a'; // aspas simples para representar o caracter (texto) char
		System.out.println("Char A = " + A);

		char B = 181; // o char tbm busca o codigo da tabela ASCII
		System.out.println("Char B = " + B);
		// o inverso tbm funciona: imprimir o valor da tabela ASCII usando uma variavel
		// int
		int caracter = 'µ';
		System.out.println("Caracter = " + caracter);

		System.out.println("Leonardo \nBráz"); // a barra invertida se chama "caracter de escape": usada para utilizar
												// alguns caracteres especiais. \n = quebra de inha \t = tabulação; \b =
												// backspace
		// TRABALHANDO COM OPERADORES
		int valor1 = 10;
		int valor2 = 20;
		int soma = valor1 + valor2;
		System.out.println("soma = " + soma);

		// MANEIRAS DE INCREMENTAR UMA VARIAVEL USANDO O OPERADOR ++
		int cont = 0;
		System.out.println("Cont = " + cont);// Imprime cont = 0

		cont = cont + 1;
		System.out.println("Cont = " + cont);// Imprime cont =1
		cont++;
		System.out.println("Cont = " + cont);// Imprime cont =2
		cont += 1;
		System.out.println("Cont = " + cont);// Imprime cont =3

		cont = 0;
		int posI = cont++; // O increment é feito apos a atribuição de cont em posI
		System.out.println("Espero que preI seja 1[" + posI + "]"); // Imprime o valor de cont (0)
		cont = 0;
		int preI = ++cont; // O increment é feito antes da atribuição de cont em preI
		System.out.println("Espero que preI seja 2[" + preI + "]"); // Imprime o valor de cont (1)
		
		//OPERADOR TERNARIO: FAZ A COMPARAÇÃO E RETORNA UM VALOR SE SATISFEITO E OUTRO SE NÃO SATISFEITO...
		//SEMELHANTE AO "IF" E "ELSE"
		int num = 38;
		String ehNome =  (2 > num) ? "Nome" : "Sobrenome";
		System.out.println(ehNome);

	}
}
