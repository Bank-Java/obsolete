package views;
import java.util.Scanner;
import models.Conta;

public class CadastrarConta {
	static Scanner sc = new Scanner(System.in);
	
	public static Conta renderizar() {
		System.out.println("\n-- CADASTRAR CONTA --\n");
		System.out.println("Digite o número da conta:");
		return new Conta(sc.next(), 0);
	}
}
