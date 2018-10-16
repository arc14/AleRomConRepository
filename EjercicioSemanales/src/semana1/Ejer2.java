package semana1;

import java.util.Scanner;

public class Ejer2 {

	// (09/10/18) Un obrero necesita calcular su salario semanal, el cual se obtiene
	// de la siguiente manera:
	// Si trabaja 40 horas o menos se le paga 16€ por hora
	// Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40
	// horas y 20€ por cada hora extra.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce horas trabajadas:");
		int horas = sc.nextInt();
		int ext;
		int res;

		if (horas < 40) {
			res = horas * 16;
			System.out.println("Ha ganado: " + res + " €");
		} else {
			ext = horas - 40;
			res = (40 * 16) + (ext * 20);
			System.out.println("Ha ganado: " + res + " €");

		}
	}
}