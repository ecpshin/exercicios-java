package application2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int item = sc.nextInt(); 
		int quantos = sc.nextInt();
		
		double total = 0.0;
		
		switch (item) {
		case 1:
			total = quantos * 4.00;
			break;
		case 2:
			total = quantos * 4.50;
			break;
		case 3:
			total = quantos * 5.00;
			break;
		case 4:
			total = quantos * 2.00;
			break;
		case 5:
			total = quantos * 1.50;
			break;	
		default:
			System.out.println("Produto não existe!");
			break;
		}
		
		System.out.printf("TOTAL: R$ %.2f", total);
		
		sc.close();

	}

}
