package view;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		double c;
		double l;
		double a;
		double p;

		Scanner s = new Scanner(System.in);

		System.out.print("Informe o comprimento: ");
		c = s.nextDouble();

		System.out.print("Informe a largura: ");
		l = s.nextDouble();

		a = c * l;
		p = (2 * c) + (2 * l);

		System.out.println("");
		System.out.println("O valor da área é de " + a + " e do perímetro é " + p);

		s.close();
	}
}
