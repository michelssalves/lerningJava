package Classes;

import Enum.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
		
	}
	public Shape(Color color) {
		
	}
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();
}
