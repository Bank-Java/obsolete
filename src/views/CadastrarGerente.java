package views;
import java.util.Scanner;
import controllers.GerenteController;
import models.Gerente;

public class CadastrarGerente {
	static Scanner sc = new Scanner(System.in);
	static Gerente gerente;
	
	public static void renderizar() {
		gerente = new Gerente();
		System.out.println("\n-- CADASTRAR GERENTE --\n");
		System.out.println("Digite o nome do Gerente:");
		gerente.setNome(sc.next());
		System.out.println("Digite a matrícula do Gerente:");
		gerente.setMatricula(sc.next());
		System.out.println("Digite o email do Gerente:");
		gerente.setEmail(sc.next());
		System.out.println("Digite o telefone do Gerente:");
		gerente.setTelefone(sc.next());
		
		if(GerenteController.cadastrar(gerente)) {
				System.out.println("Gerente cadastrado com sucesso.");
			} else {
				System.out.println("Não foi possível cadastrar esse Gerente - erro dados bancários");
		}
				

	}
}
