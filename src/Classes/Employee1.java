package Classes;

public class Employee1{
	
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee1() {
		
	}
	
	public Employee1(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public Integer getHours() {
		return hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return hours * valuePerHour;
	}
	
	

}
