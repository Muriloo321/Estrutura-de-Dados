package com.estruturadedados.vetores;

public class Vetor {
	
	private String[] elementos;
	private int size;
	
	public Vetor(int capacity) {
		this.elementos = new String[capacity];
		this.size = 0;
	}
	
	public boolean adicionar(String elemento) {
		if(size < this.elementos.length) {
			this.elementos[size] = elemento;
			size++;
			return true;
		}
		else {
			return false;
		}
	}
}
