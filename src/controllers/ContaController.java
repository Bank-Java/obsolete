package controllers;
import java.util.ArrayList;

import models.Conta;

public class ContaController {
	private static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static boolean validar(Conta conta) {
		for(Conta contaCadastrado : contas){
			if(contaCadastrado.getNumeroConta().equals(conta.getNumeroConta())) {
				return false;
			} 
		}
		
		return true;
	}

	public static boolean cadastrar(Conta conta) {
		if(contas.isEmpty()) {
			contas.add(conta);
			return true;
		}
				
		if(ContaController.validar(conta)) {
			contas.add(conta);
			return true;			
		} else {
			return false;
		}
		
	}
	
	public static ArrayList<Conta> retornarcontas() {
		return contas;
	}
		
	public static double sacar(double valorSacado, String numero, String senha) {
		for (int i = 0; i < contas.size(); i++){
			if(contas.get(i).getNumeroConta().equals(numero) && contas.get(i).getSenha().equals(senha) && contas.get(i).getSaldo() > valorSacado){
				double resul = contas.get(i).getSaldo() - valorSacado;
				contas.set(i, new Conta(numero, senha, resul)); 
				return contas.get(i).getSaldo();
			}
		}
		
		return 0;
	}
	
	public static double depositar(double valorDepositado, String numero) {
		for (int i = 0; i < contas.size(); i++){
			if(contas.get(i).getNumeroConta().equals(numero) && valorDepositado > 0){
				double resul = contas.get(i).getSaldo() + valorDepositado;
				contas.set(i, new Conta(numero, contas.get(i).getSenha(), resul)); 
				return contas.get(i).getSaldo();
			}
		}
		
		return 0;
	}
	
	public static double consultarSaldo(String numero, String senha) {
		for (int i = 0; i < contas.size(); i++){
			if(contas.get(i).getNumeroConta().equals(numero) && contas.get(i).getSenha().equals(senha)){
				return contas.get(i).getSaldo();
			}
		}
		
		return -1;
	}
	
}
