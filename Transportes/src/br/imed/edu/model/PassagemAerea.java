package br.imed.edu.model;

public class PassagemAerea {
	protected Cliente cliente;
	protected Voo voo;
	
	public String comprarPassagem(Cliente cliente, Voo voo) {
		this.cliente = cliente;
		this.voo = voo;
		return "Passagem adquirida com sucesso! ";
	}
	
	@Override
	public String toString() {
		return "Informa��es da passagem: " + voo;
	}
}