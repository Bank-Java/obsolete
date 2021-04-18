package views;
import controllers.ClienteController;
import models.Cliente;

public class ListarCliente {
	public static void renderizar() {
		System.out.println("\n-- LISTAR CLIENTES --\n");
		for(Cliente cli : ClienteController.retornarClientes()){
			System.out.println(cli);
		}
	}
}
