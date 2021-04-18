package views;
import java.util.Scanner;
import controllers.ContaController;

public class Sacar {
	static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\n-- SACAR --\n");
		System.out.println("Digite o número de sua conta:");
		String numero = sc.nextLine();
		System.out.println("Digite seu senha:");
		String senha = sc.nextLine();
		System.out.println("Digite o valor a ser sacado:");
		double valor = Double.parseDouble(sc.nextLine());
		
		if(ContaController.sacar(valor, numero, senha) == 0) {
				System.out.println("Não foi possível efetuar o saque.");
			} else {
				System.out.println("Saque efetuado com sucesso.");
				System.out.println(ContaController.sacar(valor, numero, senha));
		}
					
	}
}
