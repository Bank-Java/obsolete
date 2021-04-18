package controllers;
import java.util.ArrayList;
import models.Gerente;

public class GerenteController {
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	
	public static boolean validar(Gerente gerente) {
		for(Gerente gerenteCadastrado : gerentes){
			if(gerenteCadastrado.getMatricula().equals(gerente.getMatricula())) {
				return false;
			} 
		}
		
		return true;
	}

	public static boolean cadastrar(Gerente gerente) {
		
		if(gerentes.isEmpty()) {
			gerentes.add(gerente);
			return true;
		}
	
		if(GerenteController.validar(gerente)) {
			gerentes.add(gerente);
			return true;			
		} else {
			return false;
		}
		
	}
	
	public static ArrayList<Gerente> retornarGerentes() {
		return gerentes;
	}
}
