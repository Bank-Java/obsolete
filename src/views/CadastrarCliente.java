package views;
import java.util.Scanner;
import controllers.ClienteController;
import controllers.ContaController;
import models.Cliente;
import models.Conta;

public class CadastrarCliente {
	static Scanner sc = new Scanner(System.in);
	static Cliente cliente;
	
	public static void renderizar() {
		cliente = new Cliente();
		System.out.println("\n-- CADASTRAR CLIENTE --\n");
		System.out.println("Digite o nome do cliente:");
		cliente.setNome(sc.next());
		System.out.println("Digite o CPF do cliente:");
		cliente.setCpf(sc.next());
		System.out.println("Digite o email do cliente:");
		cliente.setEmail(sc.next());
		System.out.println("Digite o endereço do cliente:");
		cliente.setEndereco(sc.next());
		System.out.println("Digite o telefone do cliente:");
		cliente.setTelefone(sc.next());
		System.out.println("Digite a data de nascimento do cliente:");
		cliente.setDataNascimento(sc.next());
		Conta conta = CadastrarConta.renderizar();
		
		if(ContaController.cadastrar(conta)) {
			cliente.setConta(conta);
			if(ClienteController.cadastrar(cliente)) {
				System.out.println("Cliente cadastrado com sucesso.");
			} else {
				System.out.println("Não foi possível cadastrar esse cliente - erro dados bancários");
			}
		} else {
			System.out.println("Não foi possível cadastrar esse cliente - erro dados cadastrais");
		}
				

	}
}
