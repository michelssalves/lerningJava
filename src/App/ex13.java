package App;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();

		System.out.println("End of Program");
	
	}
	public static void method1() {
		
		
	}

	public static void method2() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			
			System.out.println("Fill a number");
		}
		sc.close();
		
	}
}
