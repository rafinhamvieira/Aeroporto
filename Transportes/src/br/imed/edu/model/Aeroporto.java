package br.imed.edu.model;

/**
 * 
 * @author Rafael Corr�a Vieira <rafacorreavieira2020@gmail.com>
 *
 */
public class Aeroporto extends TerminalLogistico {

	private Integer codigo;
	private String cidade;
	private Double tamanhoPista;
	private String nome;

	/**
	 * Construtor da classe Aeroporto
	 * 
	 * @param codigo       Integer
	 * @param cidade       String
	 * @param tamanhoPista Double
	 */
	public Aeroporto(Integer codigo, String cidade, String nome, Double tamanhoPista) {
		this.cidade = cidade;
		this.codigo = codigo;
		this.tamanhoPista = tamanhoPista;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getTamanhoPista() {
		return tamanhoPista;
	}

	public void setTamanhoPista(Double tamanhoPista) {
		this.tamanhoPista = tamanhoPista;
	}

	public String getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return nome + "";
	}
}