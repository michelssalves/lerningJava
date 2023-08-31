package Classes;

public class Product {
	
	private String name;
	private double price;
	private int qtde;
	
	public Product( String name, double price, int qtde) {
		
		this.name = name;
		this.price = price;
		this.qtde = qtde;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtde() {
		return qtde;
	}

	public double totalValueInStock() {
		
		return price * qtde;
	}
	public void addProducts(int qtde) {
		
		this.qtde += qtde;
		
	}
	public void removeProducts(int qtde) {
		
		this.qtde -= qtde;
		
	}
	
	public String toString() {
		
		return name +", $ " + String.format("%.2f", price) + ", " + qtde + " units, Total: $ " + String.format("%.2f",totalValueInStock());
	}

}
