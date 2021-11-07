package br.imed.edu.service;

import br.imed.edu.model.Aeroporto;
import br.imed.edu.model.Cliente;
import br.imed.edu.model.PassagemAerea;
import br.imed.edu.model.Voo;

/**
 * 
 * @author Rafael Corrêa Vieira <rafacorreavieira2020@gmail.com>
 *
 */
public class Sistema {

	public static void main(String[] args) {	

		Cliente rafael = new Cliente("Rafael", 20, "0542383833-33");
		PassagemAerea passagem1 = new PassagemAerea();
		Aeroporto aeroporto1 = new Aeroporto(18717, "Passo Fundo", "Lauro Kortz", 200.0);
		Aeroporto aeroporto2 = new Aeroporto(13243, "Recife", "Guararapes", 350.0);
		Voo voo1 = new Voo("11/5/2021", "22:00", 1, aeroporto1, aeroporto2);

		
		System.out.println(aeroporto1.addAviao("Boeing 747", 2019));
		System.out.println(aeroporto1.addOnibus("Paradiso G8 1200", 2021));
		passagem1.comprarPassagem(rafael, voo1);
		System.out.println(passagem1);
		 	
		Cliente george = new Cliente("George", 19, "98139812-23");
		PassagemAerea passagem2 = new PassagemAerea();
		Aeroporto aeroporto3 = new Aeroporto(21233, "São Paulo", "Guarulhos", 1000.0);
		Voo voo2 = new Voo("24/04/2021", "17:00", 2, aeroporto2, aeroporto3);
		passagem2.comprarPassagem(george, voo2);
		System.out.println(passagem2);
		
	}
}