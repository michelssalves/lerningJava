package App;

import java.util.Scanner;

public class appPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int numero;
			
			numero =  sc.nextInt();
			
			if(numero < 0) {
				
				System.out.println("NEGATIVO");
				
			}else {
				
				System.out.println("POSITIVO");
			}
		}

	}

}
