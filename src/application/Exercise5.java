package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int n1, n2;
		int q1, q2;
		double p1, p2;
		
		n1 = sc.nextInt();
		q1 = sc.nextInt();
		p1 = sc.nextDouble();
		
		n2 = sc.nextInt();
		q2 = sc.nextInt();
		p2 = sc.nextDouble();
		
		double total = (q1 * p1 + q2 * p2);

		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
	}

}
