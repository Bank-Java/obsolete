package models;
import java.util.Date;

public class Transferencia {
	
	public Transferencia() {
		setCriadoEm(new Date());
	}
	
	private String tipo;
	private double valor;
	private double taxa;
	private Date criadoEm;
	private Cliente clienteOrigem;
	private Cliente clienteDestino;
		
	public Cliente getClienteOrigem() {
		return clienteOrigem;
	}

	public void setClienteOrigem(Cliente clienteOrigem) {
		this.clienteOrigem = clienteOrigem;
	}

	public Cliente getClienteDestino() {
		return clienteDestino;
	}

	public void setClienteDestino(Cliente clienteDestino) {
		this.clienteDestino = clienteDestino;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}
	
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
		
}