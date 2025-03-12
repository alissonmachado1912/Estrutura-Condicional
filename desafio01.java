package exemplosEstrutura;

import java.util.Scanner;

public class desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, media;

		System.out.println("Informe a primeira nota: ");
		a = ler.nextDouble();

		System.out.println("Informe a segunda nota: ");
		b = ler.nextDouble();

		System.out.println("Informe a terceira nota: ");
		c = ler.nextDouble();

		System.out.println("Informe a quarta nota: ");
		d = ler.nextDouble();

		media = (a + b + c + d) / 4;

		if (media >= 6) {
			System.out.println("Parabéns, você tirou " + media + " e foi aprovado!");
			
		} else if (media >= 4) {
			System.out.println("Você tirou " + media + " e terá que realizar o exame!");

		} else {
			System.out.println("Você tirou " + media + " e foi reprovado.");

		}
	}

}
