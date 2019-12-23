package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double area = PI * Math.pow(raio, 2);
		
		System.out.printf("A=%.5f", area);
		
		sc.close();

	}

}
