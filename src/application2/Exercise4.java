package application2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		
		if(inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORAS");
		} else if(inicio > 12) {
			System.out.println("O JOGO DUROU " + ((24 - inicio + fim)) + " HORAS");
		} else {
			System.out.println("O JOGO DUROU " + ((fim - inicio)) + " HORAS");
		}
		
		sc.close();
	}
}
