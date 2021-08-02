package calculadoraNumFatorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entrada = 0, contador = 0;

		System.out.print("Digite o numero inteiro: ");
		entrada = sc.nextInt();
		contador = entrada;

		if (entrada == 0) {
			System.out.println("Fatorial = 1");
		} else {

			for (int i = 1; i <= contador; i++) {

				if (contador - i != 0) {
					entrada = entrada * (contador - i);
				}

			}
			System.out.printf("Fatorial = %d", entrada);
		}

		sc.close();

	}

}
