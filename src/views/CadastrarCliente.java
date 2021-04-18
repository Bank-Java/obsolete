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
		System.out.println("\n-- CADASTRAR CLIENTE --\n");
		System.out.println("Digite o nome do cliente:");
		String nome = (sc.next());
		System.out.println("Digite o CPF do cliente:");
		String cpf = (sc.next());
		System.out.println("Digite o email do cliente:");
		String email = (sc.next());
		System.out.println("Digite o endereço do cliente:");
		String endereco = (sc.next());
		System.out.println("Digite o telefone do cliente:");
		String telefone = (sc.next());
		System.out.println("Digite a data de nascimento do cliente:");
		String dataNascimento = (sc.next());
		Cliente cliente = new Cliente(nome, cpf, email, endereco, telefone, dataNascimento);
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
