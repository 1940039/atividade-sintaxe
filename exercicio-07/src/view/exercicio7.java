package view;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		double m1 = 0;
		double m2 = 0;
		double m3 = 0;
		double m4 = 0;
		double total = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("Informe sua 1ª nota: ");
		m1 = s.nextDouble();

		System.out.print("Informe sua 2ª nota: ");
		m2 = s.nextDouble();

		System.out.print("Informe sua 3ª nota: ");
		m3 = s.nextDouble();

		System.out.print("Informe sua 4ª nota: ");
		m4 = s.nextDouble();

		total = (m1 + m2 + m3 + m4) / 4;

		if (total > 0 && total < 3.5) {
			System.out.println("\nSua nota é " + total + " portanto você está reprovado.");
		} else if (total >= 3.5 && total < 6.5) {
			System.out.println("\nSua nota é " + total + " portanto você está em recuperação.");
		} else if (total >= 6.5 && total <= 10) {
			System.out.println("\nSua nota é " + total + " portanto você está aprovado.");
		} else {
			System.out.println("Valor Inválido!");
		}

		s.close();
	}
}
