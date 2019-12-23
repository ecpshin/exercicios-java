package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, tri, cir, tra, qua, ret;
				
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = (A*C) / 2.0;
		cir = Math.PI * Math.pow(C, 2.0);
		tra = ((A+B)*C)/2.0;
		qua = B * B;
		ret = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f", tri);
		System.out.printf("\nCÍRCULO: %.3f", cir);
		System.out.printf("\nTRAPÉZIO: %.3f", tra);
		System.out.printf("\nQUADRADO: %.3f", qua);
		System.out.printf("\nRETÂNGULO: %.3f", ret);
		
		sc.close();
	}

}
