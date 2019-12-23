package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A: ");
		int a = sc.nextInt();
		System.out.println("B: ");
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("SOMA: " + soma);
		
		sc.close();

	}

}
