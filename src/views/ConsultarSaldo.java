package views;
import java.util.Scanner;
import controllers.ContaController;

public class ConsultarSaldo {
	static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\n-- CONSULTAR SALDO --\n");
		System.out.println("Digite o número de sua conta:");
		String numero = sc.nextLine();
		System.out.println("Digite seu senha:");
		String senha = sc.nextLine();
		
		if(ContaController.consultarSaldo(numero, senha) == -1) {
				System.out.println("Não foi possível consultar seu saldo.");
			} else {
				System.out.println("Saldo: ");
				System.out.println(ContaController.consultarSaldo(numero, senha));
		}
					
	}
}
