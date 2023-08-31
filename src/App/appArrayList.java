package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class appArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		list.add("Michel");
		list.add("Mayumi");
		list.add("Rafaele");
		list.add("Douglas");
		list.add("Iza");
		list.add(2,"Pedro");
		
		System.out.println(list.size());
		
		for (String x : list) { System.out.println(x); }
		
		System.out.println("----------------------");
		
		list.removeIf(x-> x.charAt(0) == 'M');
		list.remove("Iza");
		list.remove(1);
		
		for (String x : list) { System.out.println(x); }
		
		System.out.println("----------------------");
		System.out.println("Index of Iza: " + list.indexOf("Iza"));
		System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : list) { System.out.println(x); }
		
		System.out.println("----------------------");
		String name = list.stream().filter(x->x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);

		sc.close();

	}

}
