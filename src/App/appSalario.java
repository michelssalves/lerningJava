package App;

import java.util.Scanner;

public class appSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double imposto;

        if (salario <= 2000.00) {
            imposto = 0.00;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
        } else {
            imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
        }

        if (imposto == 0.00) {
            System.out.println("Isento de Imposto de Renda");
        } else {
            System.out.printf("Imposto de Renda: R$ %.2f%n", imposto);
        }

        sc.close();

	}

}
