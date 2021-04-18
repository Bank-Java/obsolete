package controllers;
import java.util.ArrayList;

import models.Conta;

public class ContaController {
	private static ArrayList<Conta> bancos = new ArrayList<Conta>();
	
	public static boolean validar(Conta banco) {
		for(Conta bancoCadastrado : bancos){
			if(bancoCadastrado.getNumeroConta().equals(banco.getNumeroConta())) {
				return false;
			} 
		}
		
		return true;
	}

	public static boolean cadastrar(Conta banco) {
		if(bancos.isEmpty()) {
			bancos.add(banco);
			return true;
		}
				
		if(ContaController.validar(banco)) {
			bancos.add(banco);
			return true;			
		} else {
			return false;
		}
		
	}
	
	public static ArrayList<Conta> retornarBancos() {
		return bancos;
	}
	
	public static double sacar(Conta conta, double valorSacado) {
		if(conta.getSaldo() > 0 && conta.getSaldo() > valorSacado) {
			conta.setSaldo(conta.getSaldo() - valorSacado); 
			return conta.getSaldo();
		}
		return 0;
	}
}
