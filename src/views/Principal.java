package views;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1 – Cadastrar de Cliente\r\n"
					+ "2 – Cadastrar Gerente\r\n"
					+ "3 – Sacar\r\n"
					+ "4 – Depositar\r\n"
					+ "5 – Extrato\r\n"
					+ "6 – Consultar saldo\r\n"
					+ "7 – Transferir\r\n"
					+ "8 – Atualizar dados cadastrais\r\n"
					+ "0 – Sair\r\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				CadastrarCliente.renderizar();
				break;
			case 2:
				CadastrarGerente.renderizar();
				break;
			case 3:
				Sacar.renderizar();
				break;
			case 4:
				Depositar.renderizar();
				break;
			case 5:
				break;
			case 6:
				ConsultarSaldo.renderizar();
				break;
			case 7:
				break;
			case 8:
				Atualizar.renderizar();
				break;
			case 0:
				System.out.println("\nEncerrando sistema.");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}			
		} while (opcao != 0);
		
		sc.close();
		
	}
}