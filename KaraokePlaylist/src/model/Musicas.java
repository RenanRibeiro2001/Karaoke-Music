package model;

public class Musicas {
	
	private String nomeMusica;
	private double nota;
	
	public Musicas(String nomeMusica, double nota) {
		
		this.nomeMusica = nomeMusica;
		this.nota = nota;
		nota = 0;
	}
	
	public void notaMusica(int novaNota) {
		
		if(nota > 0) {
			
		}
		else {
			
			nota = (nota + novaNota) / 2;
		}	
	}

}
