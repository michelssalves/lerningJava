package App;

import java.util.Locale;
import java.util.Scanner;

import Classes.CurrencyConverter;

public class appConverterMoeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		
		CurrencyConverter.valorDoDolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		
		CurrencyConverter.valorEmDollar = sc.nextDouble();
		
		CurrencyConverter.converter(CurrencyConverter.valorDoDolar, CurrencyConverter.valorEmDollar);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.valorEmReaisIof);


	}

}
