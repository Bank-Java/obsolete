package controllers;
import java.util.ArrayList;

//import java.util.Objects;
//import java.util.Optional;
import models.Cliente;

public class ClienteController {
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static boolean validar(Cliente cliente) {
		for(Cliente clienteCadastrado : clientes){
			if(clienteCadastrado.getCpf().equals(cliente.getCpf())) {
				return false;
			} 
		}
		
		return true;
	}

	public static boolean cadastrar(Cliente cliente) {
		if(clientes.isEmpty()) {
			clientes.add(cliente);
			return true;
		}
				
		if(ClienteController.validar(cliente)) {
			clientes.add(cliente);
			return true;			
		} else {
			return false;
		}
		
	}
	
	public static ArrayList<Cliente> retornarClientes() {
		return clientes;
	}
}
