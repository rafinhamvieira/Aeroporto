package br.imed.edu.model;

public class TerminalLogistico {
	private String aviao;
	private String onibus;
	private String modelo;
	private Integer ano;
	
	public String getModelo() {
		return modelo;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public String getAviao() {
		return aviao;
	}
	
	public void setAviao(String aviao) {
		this.aviao = aviao;
	}
	
	public String getOnibus() {
		return onibus;
	}
	
	public void setOnibus(String onibus) {
		this.onibus = onibus;
	}
	
	/**
	 * Adiciona avi�o no terminal
	 * @param modelo String
	 * @param ano Integer
	 * @return String
	 */
	public String addAviao(String modelo, Integer ano) {
		this.modelo = modelo;
		this.ano = ano;
		return "Avi�o adicionado com sucesso";
	}
	
	/**
	 * Adiciona onibus no terminal
	 * @param modelo String
	 * @param ano Integer
	 * @return String
	 */
	public String addOnibus(String modelo, Integer ano) {
		this.modelo = modelo;
		this.ano = ano;
		return "�nibus adicionado com sucesso";
	}
	
}
