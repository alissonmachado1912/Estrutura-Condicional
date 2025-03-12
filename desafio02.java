package exemplosEstrutura;

import java.util.Scanner;

public class desafio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe sua idade :");
		numero = ler.nextInt();

		if (numero < 12) {
			System.out.println("A idade informada é de uma criança.");

		} else if (numero >= 12 && numero <= 17) {
			System.out.println("A idade informada é de um adolescente.");

		} else if (numero >= 18 && numero <= 59) {
			System.out.println("A idade informada é de um adulto.");

		} else
			System.out.println("A idade informada é de um idoso.");
	}

}
