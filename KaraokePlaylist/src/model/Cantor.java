package model;

import java.util.Arrays;

public class Cantor {

	private String nome;
	private double[] notas = new double[10];
	private int ultimaNota;
	
	public void receberNovaNota(int nota) {
		
		ultimaNota = nota;
		Arrays.sort(notas);
		
		if(notas[0] < nota) {
			 notas[0] = nota;
			 Arrays.sort(notas);
		}	
	}
	
	public void mostrarMelhoresNotas() {
		
		Arrays.sort(notas);
		
		for(int i = 0 ; i <= notas.length ; i++) {
			System.out.println(notas[i]);
		}
	}
	

	
}
