package App;

import java.util.Scanner;

public class appTipagens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//SCANNER DE STRING
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		

		//SCANNER DE INT
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		

		//SCANNER DE FLOAT
		double z;
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + z);
		
		//SCANNER DE CHAR
		char a;
		a = sc.next().charAt(0);
		System.out.println("Voce digitou: " + a);
		
		
		sc.close();
		

	}
}
