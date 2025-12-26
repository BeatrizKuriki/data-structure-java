package com.beatriz.estruturadados.vetor.teste;

import com.beatriz.estruturadados.vetor.Vetor;


public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);

		vetor.remove(4);
		System.out.println(vetor);
		
		int pos = vetor.busca("H");
		if(pos > -1) {
			vetor.remove(pos);
		}else {
			System.out.println("ELEMENTO NÃO EXISTE");
		}
		System.out.println(vetor);
		
	}

}
