package App;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtde1, qtde2;
		double valorUnitario1,valorUnitario2, valorTotal1, valorTotal2, valorTotal;
		
		cod1 = sc.nextInt();
		qtde1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtde2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorTotal = (qtde1 * valorUnitario1)+ (qtde2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
	}

}
