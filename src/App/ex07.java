package App;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Locale.setDefault(Locale.US);	
		 Scanner sc = new Scanner(System.in);
		 
		 int matricula;
		 double horas, valorHoras, salario;
		 
		 matricula = sc.nextInt();
		 horas = sc.nextDouble();
		 valorHoras = sc.nextDouble();
		 
		 salario = horas * valorHoras;
		 

		 System.out.printf("Funcionario matricula %d trabalhou %.2f horas, seu salario e %.2f R$", matricula, horas,salario);


	}

}
