package models;

public class Cliente {
	private String nome;
	private String cpf;
    private String endereco;
    private String telefone;
    private String email;
	private String dataNascimento;
	private Conta conta;

	public String getNome() {
		return nome;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente outroCliente = (Cliente) obj;
		return getCpf() == outroCliente.getCpf();
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf() + getConta() ;
		
	}
}
