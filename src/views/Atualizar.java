package views;
import java.util.Scanner;
import controllers.ClienteController;

public class Atualizar {
	static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\n-- ATUALIZAR CLIENTE --\n");
		System.out.println("Digite o CPF do cliente:");
		String cpf = (sc.next());
		System.out.println("Digite o nome para atualizar:");
		String nome = (sc.next());
		System.out.println("Digite o email para atualizar:");
		String email = (sc.next());
		System.out.println("Digite o endere�o para atualizar:");
		String endereco = (sc.next());
		System.out.println("Digite o telefone para atualizar:");
		String telefone = (sc.next());
		System.out.println("Digite a data de nascimento para atualizar:");
		String dataNascimento = (sc.next());
		
		if(ClienteController.atualizar(nome, cpf, email, endereco, telefone, dataNascimento)) {
				System.out.println("Cliente atualizado com sucesso.");
			} else {
				System.out.println("N�o foi poss�vel atualizar esse cliente.");
		}
	}
}
