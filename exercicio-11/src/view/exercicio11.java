package view;

import java.text.NumberFormat;
import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		double qdia = 0;
		double q = 0;
		double qtotal = 0;
		int i;
		int dias;
		double valor = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("Informe a quantidade de dias utilizando o carro: ");
		dias = s.nextInt();

		for (i = 1; i <= dias; i++) {
			System.out.print("Informe a quilometragem do dia " + i + ": ");
			qdia = s.nextDouble();

			if (qdia > 60) {
				q = qdia - 60;

				qtotal = qtotal + q;
			} else {
				valor = dias * 45;
			}
		}

		valor = (qtotal * 0.50) + (dias * 45);

		System.out.print("\nO valor final a ser pago é " + NumberFormat.getCurrencyInstance().format(valor));

		s.close();
	}
}
