package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		System.out.println("NUMÉRO: " + num);
		System.out.printf("SALÁRIO: $ %.2f", salario);

		sc.close();
	}

}
