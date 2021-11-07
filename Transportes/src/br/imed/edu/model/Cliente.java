package br.imed.edu.model;

/**
 * 
 * @author Rafael Corrêa Vieira <rafacorreavieira2020@gmail.com>
 *
 */
public class Cliente {
	private String nome;
	private Integer idade;
	private String cpf;
	
	/**
	 * Construtor da classe cliente
	 * @param nome
	 * @param idade
	 * @param cpf
	 */
	public Cliente(String nome, Integer idade, String cpf) {
		this.nome= nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
}
