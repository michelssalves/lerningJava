package App;

import java.util.Scanner;

public class appImpostoDeRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//precisa iniciar as variaveis fora do IF com zero pra nao dar erro
				double faixa1 = 80;
				double faixa2 = 270;
				
				System.out.println("Digite sua renda");
				double valor = sc.nextDouble();
				
				if(valor > 4500.00) {
					
					double valorTributado = valor - 4500;
					
					double imposto = (valorTributado * 28) / 100;
					
					imposto = imposto + faixa1 + faixa2;
					
					System.out.printf("Seu imposto e %.2f\n", imposto);
					
				}else if(valor > 3000.00 && valor < 4500.01){
					
					double valorTributado = valor - 3000.01;
					
					double imposto = (valorTributado * 18) / 100;
					
					imposto = imposto + faixa1;
					
					System.out.printf("Seu imposto e %.2f\n", imposto);
					
				}else if(valor > 2000.00 && valor < 3000.01){
					
					double valorTributado = valor - 2000.01;
					
					double imposto = (valorTributado * 8) / 100;
					
					System.out.printf("Seu imposto e %.2f\n", imposto);
					
				}else {
					
					System.out.printf("Isento");
				}

				      sc.close();

	}

}
