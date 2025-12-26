package com.beatriz.estruturadados.vetor.teste;

import com.beatriz.estruturadados.vetor.Contato;
import com.beatriz.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		vetor.adiciona("Stella");
		vetor.adiciona(false);
		vetor.adiciona(2.3);
		System.out.println("TAMANHO = " + vetor.tamanho());
		System.out.println(vetor);
		
		Contato c1 = new Contato("Beatriz Alencar Kuriki", "43991125859", "dev.beatriz.alencar@gmail.com", 38);
		Contato c2 = new Contato("Olivia Alencar Kuriki", "4399112515239", "car@gmail.com", 32);
		Contato c3 = new Contato("Jurandir Kuriki", "4399988925859", "dev@gmail.com", 18);
		Contato c4 = new Contato("Jurandir Kuriki", "4399988925859", "dev@gmail.com", 18);
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		System.out.println(vetor);
		
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("CONTATO EXISTE NO VETOR");
		}else {
			System.out.println("CONTATO NAO EXISTE NO VETOR");
		}
	}

}
