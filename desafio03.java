package exemplosEstrutura;

import java.util.Scanner;

public class desafio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número informado é PAR.");

		} else {
			System.out.println("O número informado é ÍMPAR.");
		}
	}
}