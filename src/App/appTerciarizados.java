package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Classes.Employee1;
import Classes.OutSourcedEmployee;

public class appTerciarizados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//Locale.setDefault(Locale.US);
		
		List<Employee1> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hours: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
	
			}else {

				list.add(new Employee1 (name, hours, valuePerHour));
			}
		}
		
		
		System.out.println();
		System.out.println("PAYMENTS");
		for(Employee1 emp : list ) {
			
			System.out.println(emp.getName() + " - " + String.format("%.2f", emp.payment()));
		}
		System.out.println();
		System.out.println();
		sc.close();
		

	}

}
