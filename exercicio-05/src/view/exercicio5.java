package view;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		double imc = 0;
		double peso = 0;
		double altura = 0;
		String sexo;

		Scanner s = new Scanner(System.in);

		System.out.print("Informe o Peso: ");
		peso = s.nextDouble();

		System.out.print("Informe o Altura: ");
		altura = s.nextDouble();

		System.out.print("Digite F para Feminino e M para Masculino: ");
		sexo = s.next();

		imc = peso / (altura * altura);

		System.out.println("");

		if (sexo.equalsIgnoreCase("F")) {
			if (imc > 0 && imc < 19.1) {
				System.out.println("Seu peso esta abaixo de 19.1 com o IMC de " + imc);
			} else if (imc >= 19.1 && imc <= 25.8) {
				System.out.println("Seu peso esta adequado para a sua altura com o IMC de " + imc);
			} else {
				System.out.println("Seu peso esta acima de 25,8 com o IMC de " + imc);
			}
		} else if (sexo.equalsIgnoreCase("M")) {
			if (imc > 0 && imc < 20.7) {
				System.out.println("Seu peso esta abaixo de 20,7 com o IMC de " + imc);
			} else if (imc >= 20.7 && imc <= 26.4) {
				System.out.println("Seu peso esta adequado para a sua altura com o IMC de " + imc);
			} else {
				System.out.println("Seu peso esta acima de 26,4 com o IMC de " + imc);
			}
		}

		s.close();
	}
}
