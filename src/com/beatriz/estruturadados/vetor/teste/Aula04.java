package com.beatriz.estruturadados.vetor.teste;

import com.beatriz.estruturadados.vetor.Vetor;



public class Aula04 {

	public static void main(String[] args) {
	

		Vetor vetor = new Vetor(5);
		vetor.adiciona("ELEMENTO 1");
		vetor.adiciona("ELEMENTO 2");
		vetor.adiciona("ELEMENTO 3");

		vetor.adiciona("ELEMENTO 4");
		System.out.println(vetor.tamanho());
		System.out.println(vetor);

	}

}
