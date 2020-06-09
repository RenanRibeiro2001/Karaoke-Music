package model;

import java.util.ArrayList;
import java.util.Arrays;

import control.Validacoes;

public class Cantor {

	private String nome;
	private int[] notas = new int[10];
	private int ultimaNota;

	public Cantor(String nome) {
		this.setNome(nome);
	}
	
	public void receberNovaNota(int nota) {

		ultimaNota = nota;
		Arrays.sort(notas);

		if (notas[0] < nota) {
			notas[0] = nota;
			Arrays.sort(notas);
		}
	}

	public void mostrarMelhoresNotas() {

		Arrays.sort(notas);

		for (int i = 0; i <= notas.length; i++) {
			System.out.println(notas[i]);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
