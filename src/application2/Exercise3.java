package application2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler dois número inteiros e verificar de eles são múltiplos");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			if(a % b == 0) {
				System.out.println("Sao Multiplos.");
			} else {
				System.out.println("Nao sao multiplos.");
			}
		} else if (b > a) {
			if(b % a == 0) {
				System.out.println("Sao multiplos");
			} else {
				System.out.println("Nao sao multiplos.");
			}
		}
		sc.close();

	}

}
