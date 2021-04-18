package models;

public class Conta {
	
	public Conta(String numeroConta, double saldo) {
		this.saldo = saldo;
		this.numeroConta = numeroConta;
	}
	
	private String numeroConta;
	private double saldo;	

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return " | Número da conta: " + getNumeroConta() + " | Saldo: " + getSaldo();
	}	
}