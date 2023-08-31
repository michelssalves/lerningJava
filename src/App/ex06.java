package App;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		 int A, B, C, D, diferenca;
		 
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = sc.nextInt();
		 D = sc.nextInt();
		 
		 diferenca = (A * B - C * D);
		 
		 System.out.printf("Diferenca e %d", diferenca);

	}

}
