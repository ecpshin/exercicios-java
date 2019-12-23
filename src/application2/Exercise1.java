package application2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.print("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		sc.close();
	}

}
