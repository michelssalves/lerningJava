package App;

import java.util.Scanner;

public class appHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hr1, hr2, total;
		
		System.out.println("Digite a hora inicial");
		hr1 = sc.nextInt();
		System.out.println("Digite a hora final");
		hr2 = sc.nextInt();
		
		if(hr1 < hr2) {
			total = hr2 - hr1;
			
		}else {
			// x  =  24 - 23 + 2
			total = 24 - hr1 + hr2;
		}
		
		
		System.out.printf("O JOGO DUROU %d HORA(S)", total);

	}

}
