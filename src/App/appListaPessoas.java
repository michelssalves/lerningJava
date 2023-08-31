package App;

import java.util.Locale;
import java.util.Scanner;

import Classes.Pessoa;

public class appListaPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		for(int i=0; i< vect.length; i++) {
			
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double height = sc.nextDouble();	
			vect[i] = new Pessoa(name, age, height);
			
		}
		double sum = 0.0;
		int cont = 0;
		for(int i=0; i< vect.length; i++) {
			
			System.out.printf("Name: %s  Age: %d Height: %.2f%n", vect[i].getName(), vect[i].getAge(),vect[i].getHeight());
			sum += vect[i].getHeight();
			
			if( vect[i].getAge() < 16) {
				cont = cont +1;
			}
			

		}
	
		double mediumHeight = sum / vect.length;
		double percentAge = (cont * 100.0)/ vect.length ;
		
		System.out.printf("Altura media: %.2f% %n",mediumHeight);
		System.out.printf("Porcentagem com idade menor a 16: %.1f%n",percentAge);
		
		for(int i=0; i< vect.length; i++) {
			
			if( vect[i].getAge() < 16) {
				System.out.printf("%s", vect[i].getName());
			}
			

		
		}
		
		sc.close();

	}

}
