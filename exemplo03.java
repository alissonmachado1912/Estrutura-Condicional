package exemplosEstrutura;

import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número :");
		numero = ler.nextInt();

		if (numero > 0) {
			System.out.println("O número é positivo.");
		} else if (numero == 0) {
			System.out.println("O número é 0.");
		} else {
			System.out.println("O número é negativo.");
		}

	}

}
