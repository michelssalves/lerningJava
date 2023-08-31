package App;

import java.util.Locale;
import java.util.Scanner;

import Classes.Room;

public class appHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Room room;
		
	
		Room[] vect = new Room[10];
		
		System.out.println("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		for(int i=0; i< rooms; i++) {
		
			System.out.printf("Which the numbers of room %d? %n",(i+1));
			int number = sc.nextInt();
			System.out.println("Which the name? ");
			sc.nextLine();
			String name = sc.next();
			sc.nextLine();
			System.out.println("Which the email? ");
			String email = sc.next();
			
			vect[number] = new Room(name, email, number);
			
			
		}
		System.out.println("Buzy rooms: ");
		for(int i=0; i< vect.length; i++) {
			
			if(vect[i] != null) {
				
				System.out.println(i + ": " +vect[i]);
			
			}
			
		}
		sc.close();


	}

}
