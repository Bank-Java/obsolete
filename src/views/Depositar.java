package views;
import java.util.Scanner;
import controllers.ContaController;

public class Depositar {
	static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\n-- DEPOSITAR --\n");
		System.out.println("Digite o n�mero de sua conta:");
		String numero = sc.nextLine();
		System.out.println("Digite o valor a ser depositado:");
		double valor = Double.parseDouble(sc.nextLine());
		
		if(ContaController.depositar(valor, numero) == 0) {
				System.out.println("N�o foi poss�vel efetuar o deposito.");
			} else {
				System.out.println("Dep�sito efetuado com sucesso.");
				System.out.println(ContaController.depositar(valor, numero));
		}
					
	}
}
