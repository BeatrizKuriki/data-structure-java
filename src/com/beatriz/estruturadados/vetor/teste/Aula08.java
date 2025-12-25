package com.beatriz.estruturadados.vetor.teste;

import com.beatriz.estruturadados.vetor.Vetor;

public class Aula08 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);

		vetor.adiciona(0, "A");
		System.out.println(vetor);
		System.out.println();
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);

		vetor.adiciona(0, "A");
		System.out.println(vetor);
		System.out.println();
		
	}

}
