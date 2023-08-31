package App;

import java.util.Locale;
import java.util.Scanner;

public class appPosNegVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0;i < vect.length; i++) {
			System.out.print("Digite um numero: ");
				vect[i] = sc.nextDouble();
			
		}
		double negativos = 0.0;
		System.out.println("Numeros Negativos");
		for(int i=0;i < vect.length; i++) {
			
			if(vect[i] < 0) {
				
				System.out.printf("%.2f%n", vect[i]);
			
			}
			
		}

	}

}
