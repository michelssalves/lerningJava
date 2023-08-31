package App;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		  
		  double pi = 3.14159, raio, area;
		  
		  raio = sc.nextDouble();
		 
		  area = pi * Math.pow(raio, 2);
		  
		  Locale.setDefault(Locale.US);	
		  
		  System.out.printf("A area e %.4f", area);

	}

}
