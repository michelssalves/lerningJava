package App;

import java.util.Random;
import java.util.Scanner;

import Classes.Conta;

public class appBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean conta = true;
		Conta cont = new Conta();
	
		
		while(true) {
			
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
	
		System.out.println("");
		System.out.println("Escolha a opcao desejada");
		if(conta) {
		System.out.println("1 - Criar uma conta");
		}
		
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("Qualquer tecla para sair");

		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			
			System.out.println("Digite seu nome");
			sc.nextLine();
			String nomeTitular = sc.nextLine();
			int numeroConta = random.nextInt(100);
			conta = false;
		
			cont = new Conta(numeroConta, nomeTitular);
			

			
			
		}else if(opcao == 2){
			
			if(cont.getSaldo()){
				
				System.out.println("Digite o valor");
				double valorSaque = sc.nextDouble();
				
				if(!(valorSaque > cont.getSaldoValor())){
				cont.setValorSaque(valorSaque);
				}else {
					
		
					System.out.printf("Saldo insuficiente! %.2f R$ %n", cont.getSaldoValor());
	
					
				}
			}else {
				
				System.out.printf("Saldo insuficiente! %.2f R$ %n", cont.getSaldoValor());
		
			}

			
		}else if(opcao == 3){
						
			System.out.println("Digite o valor");
			double valorDeposito = sc.nextDouble();
			
			cont.setValorDeposito(valorDeposito);
			
		}else {
			System.out.println("Tchau");
			break;
		}
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Conta Atual");
		System.out.println(cont);

		System.out.println("-------------------------------");
		
		}
	}

	}


