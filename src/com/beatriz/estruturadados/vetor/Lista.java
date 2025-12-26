package com.beatriz.estruturadados.vetor;

public class Lista <T>{
	private T[] elementos;
	private int tamanho;
	private int posicao;
	
	
	
//maneira elegante de in
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}


	public boolean adiciona(T elemento) {
		aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
	}


	public boolean adiciona(int posicao,T elemento) {
		aumentaCapacidade();
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA");
		}
		for(int i=this.tamanho -1; i>= this.posicao; i--) {
			this.elementos[i+1] = this.elementos[i];

		}
		this.elementos[posicao] = elemento;
		this.tamanho++;


		return true;		

	}
	private void aumentaCapacidade( ) {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object [this.elementos.length *2];
			for(int i =0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}

	}
	//B G D E F -> POSIÇÃO A SER REMOVIDA É 1 (G)
	//0 1 2 3 4 -> TAMANHO É 5
	//VETOR[1] = VETOR[2]
	//VETOR[2] = VETOR [3]
	//VETOR[3] = VETOR [4]
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA");
		}
		for(int i = posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;


	}
	public int tamanho() {
		return this.tamanho;
	}

	public Object busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("POSIÇÃO INVÁLIDA");
		}
		return elementos[posicao];

	}
	public int busca(T elemento) {
		for(int i =0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;

	}


	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(" ,");
		}
		if (this.tamanho> 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");

		return s.toString();
	}

}
