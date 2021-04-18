package models;

public class Conta {
	
	public Conta(String numeroConta, String senha, double saldo) {
		this.saldo = saldo;
		this.senha = senha;
		this.numeroConta = numeroConta;
	}
	
	private String numeroConta;
	private String senha;
	private double saldo;	
	// atributo registro para os comprovantes

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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