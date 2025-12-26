package com.beatriz.estruturadados.vetor.teste;

import com.beatriz.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		vetor.adiciona("BEATRIZ ");
		vetor.adiciona("BARBARA");
		vetor.adiciona("ANTONIO");
		System.out.println(vetor.busca("ANTONIO"));
		System.out.println(vetor.busca(3));
	}

}
