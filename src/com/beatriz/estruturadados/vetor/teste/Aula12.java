package com.beatriz.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		

		arrayList.add("A");
		arrayList.add("D");
		
		System.out.println(arrayList);
		arrayList.add(0, "11");
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("h");
		if(existe) {
			System.out.println("O ELEMENTE EXISTE");
		}else {
			System.out.println("Não existe");
		}
		
		int posicao = arrayList.indexOf("D");
		System.out.println(posicao);
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size());
	}
	
	

}
