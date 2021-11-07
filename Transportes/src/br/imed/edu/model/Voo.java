package br.imed.edu.model;

/**
 * 
 * @author Rafael Corr�a Vieira <rafacorreavieira2020@gmail.com>
 *
 */
public class Voo {
	private String dataPartida;
	private String horarioPartida;
	private Integer numeroVoo;
	private Aeroporto aeroportoOrigem;
	private Aeroporto aeroportoChegada;

	/**
	 * Construtor da classe Voo
	 * 
	 * @param dataPartida      String
	 * @param horarioPartida   String
	 * @param numeroVoo        Integer
	 * @param aeroportoOrigem  Aeroporto
	 * @param aeroportoChegada Aeroporto
	 */
	public Voo(String dataPartida, String horarioPartida, Integer numeroVoo, Aeroporto aeroportoOrigem,
			Aeroporto aeroportoChegada) {
		this.dataPartida = dataPartida;
		this.horarioPartida = horarioPartida;
		this.numeroVoo = numeroVoo;
		this.aeroportoOrigem = aeroportoOrigem;
		this.aeroportoChegada = aeroportoChegada;
	}

	@Override
	public String toString() {
		return "A data de partida �: " + dataPartida + ", o hor�rio �: " + horarioPartida + ", o n�mero do voo �: "
				+ numeroVoo + ", o aeroporto de origem �: " + getAeroportoOrigem() + ", na cidade de: "
				+ getAeroportoOrigem().getCidade() + " e o aeroporto de chegada �: " + getAeroportoChegada()
				+ ", na cidade de: " + getAeroportoChegada().getCidade();
	}

	public String getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(String dataPartida) {
		this.dataPartida = dataPartida;
	}

	public String getHorarioPartida() {
		return horarioPartida;
	}

	public void setHorarioPartida(String horarioPartida) {
		this.horarioPartida = horarioPartida;
	}

	public Integer getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(Integer numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public Aeroporto getAeroportoOrigem() {
		return aeroportoOrigem;
	}

	public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
		this.aeroportoOrigem = aeroportoOrigem;
	}

	public Aeroporto getAeroportoChegada() {
		return aeroportoChegada;
	}

	public void setAeroportoChegada(Aeroporto aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}

}
