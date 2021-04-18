package controllers;
import java.util.ArrayList;
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
	
	public static boolean atualizar(String nome, String cpf, String email, String endereco, String telefone,
			String dataNascimento) {
		for (int i = 0; i < clientes.size(); i++){
			if(clientes.get(i).getCpf().equals(cpf)){
				clientes.set(i, new Cliente(nome, clientes.get(i).getCpf(), email, endereco, telefone, dataNascimento)); 
				return true;
			}
		}
		return false;
	}
}
