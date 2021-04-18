package views;
import java.util.Scanner;
import models.Conta;

public class CadastrarConta {
	static Scanner sc = new Scanner(System.in);
	
	public static Conta renderizar() {
		System.out.println("\n-- CADASTRAR CONTA --\n");
		System.out.println("Digite o número da conta:");
		String numero = (sc.nextLine());
		System.out.println("Digite a senha da conta:");
		String senha = (sc.nextLine());
		Conta conta = new Conta(numero, senha, 0);
		return conta;
	}
}
