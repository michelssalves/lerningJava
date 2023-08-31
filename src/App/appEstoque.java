package App;

import java.util.Locale;
import java.util.Scanner;

import Classes.Product;

public class appEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter product data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.print("Price:");
		double price = sc.nextDouble();
		System.out.print("Quantity:");
		int qtde = sc.nextInt();
		
		Product product = new Product(name, price, qtde);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		qtde = sc.nextInt();
		product.addProducts(qtde);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		qtde = sc.nextInt();
		product.removeProducts(qtde);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		
		sc.close();
	}

}
