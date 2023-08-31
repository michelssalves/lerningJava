package Classes;

public class Conta {
	
	private int numeroConta;
	private String nomeTitular;
	private double valorDeposito;
	private double valorSaque;
	private double saldo = 0;
	
	public Conta() {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;

	}
	
	public Conta(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;

	}

	public double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		
		
		this.saldo -= valorSaque + (valorSaque * 0.05) ;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	
	public void setValorDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	public boolean getSaldo() {
		
		if(saldo > 0) {
			
			return true;
		}
		return false;
	}
	
	public double getSaldoValor() {

		return saldo;
	}
	public String toString() {
		
		return "Conta "
				+ numeroConta 
				+ " Titular " 
				+ nomeTitular
				+ " Saldo R$ "
				+ String.format("%.2f", saldo);
	}

}
