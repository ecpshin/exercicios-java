package application2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if(numero >= 0.0 && numero <= 25.0 ) {
			System.out.println("[0,25]");
		} else if(numero > 25.0 && numero <= 50.0){
			System.out.println("(25,50]");
		} else if (numero > 50.0 && numero <= 75.0) {
			System.out.println("(50,75]");
		} else if(numero > 75.0 && numero <= 100.0) {
			System.out.println("(75,100]");
		} else {
			System.out.println("Fora de intervalo!");
		}
		
		sc.close();

	}

}
