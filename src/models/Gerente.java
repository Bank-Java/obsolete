package models;

public class Gerente {
	private String nome;
	private String email;	
	private String telefone;
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public String getNome() {
		return this.nome;
	}
		
	@Override
	public String toString() {
		return "Nome: " + nome + " | Telefone: " + telefone + " | E-mail: " + email;
	}
}