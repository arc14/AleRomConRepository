package semana1;

import java.util.Scanner;

public class Ejer1 {
	
	//(09/10/18) Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduce un número entre 0 y 9999:");
		int num = sc.nextInt();
		
		if (num > 0 && num <= 9)
			System.out.println("El número tiene 1 cifra");
		else if (num >= 10 && num <= 99)
			System.out.println("El número tiene 2 cifras");
		else if (num >= 100 && num <= 999)
			System.out.println("El número tiene 3 cifras");
		else if (num >= 1000 && num <= 9999)
			System.out.println("El número tiene 4 cifras");
		else
			System.out.println("El número es mayor de 4 cifras o es el número 0");

	}
	
}
