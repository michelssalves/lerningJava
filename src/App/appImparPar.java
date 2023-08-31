package App;

import java.util.Scanner;

public class appImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um numero");
		n1 = sc.nextInt();

		if(n1 % 2 != 0) {
			System.out.println("IMPAR");
		}else{
			System.out.println("PAR");
		}

	}

}
