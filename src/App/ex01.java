package App;

import java.util.Locale;

public class ex01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double priceComputer = 2100.00;
		double priceDesk = 650.50;
		double medida = 53.23456700;
		int idade = 30;
		int codigo = 5290;
		String genero = "F";
		
		
		System.out.println("Products");
		System.out.printf("Computer, which price is $ %.2f%n", priceComputer);
		System.out.printf("Office desk, which price is $ %.2f%n", priceDesk);
		System.out.printf("Record: %d years old, code %d and gender: %s%n",idade, codigo, genero);
		System.out.printf("Measue with eight decimal places: %.8f%n", medida );
		System.out.printf("Rouded (three decima places):  %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point:  %.3f%n", medida);

	}

}
