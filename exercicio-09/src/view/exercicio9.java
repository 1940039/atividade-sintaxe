package view;

import java.text.NumberFormat;
import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		double areac = 0;
		double areanc = 0;
		double areatotal = 0;
		double imposto = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("Determine a área total do terreno em m²: ");
		areatotal = s.nextDouble();

		System.out.print("Determine a área construida do terreno em m²: ");
		areac = s.nextDouble();

		areanc = (areatotal - areac) * 3.80;
		areac = areac * 5;

		imposto = areanc + areac;

		System.out.println("\nO valor total a ser pago é de " + NumberFormat.getCurrencyInstance().format(imposto));

		s.close();
	}
}