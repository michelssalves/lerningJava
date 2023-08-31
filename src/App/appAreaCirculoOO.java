package App;

import java.util.Locale;
import java.util.Scanner;

import Classes.Calculator;

public class appAreaCirculoOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio");
		double raio = sc.nextDouble();
		
		double c = Calculator.circumference(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI valor: %.2f%n", Calculator.PI);
		sc.close();

	}

}
