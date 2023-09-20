package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Classes.Shape;
import Classes.Rectangle;
import Classes.Circle;
import Enum.Color;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {

			System.out.println("Shape #" + i + "data: ");
			System.out.println("Rectangle or Circle(R/C)");
			char ch = sc.next().charAt(0);
			System.out.print("Color(BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
			sc.nextLine();
			if (ch == 'r') {
				System.out.print("Width");
				Double width = sc.nextDouble();
				System.out.print("Height");
				Double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius");
				Double radius = sc.nextDouble();
				list.add(new Circle(color, radius));

			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : list){
			System.out.println(String.format("%.2f", shape.area()));
			
		}
		sc.close();
	}

}
