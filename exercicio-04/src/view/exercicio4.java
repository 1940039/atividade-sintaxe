package view;

import java.util.Scanner;
import java.text.NumberFormat;

public class exercicio4 {
	public static void main(String[] args) {
		double total = 0;
		double real = 5.10;
		double valor = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("$1 = R$ 5,10");
		System.out.println("");

		System.out.print("Digite um valor para conversão: ");
		valor = s.nextDouble();

		total = valor * real;

		System.out.println("A conversão de $" + valor + " dolares para reais é de "
				+ NumberFormat.getCurrencyInstance().format(total));

		s.close();
	}
}