package model;

public class Musica {
	
	private int codigo;
	private int nota;
	private double tempoDeDuracao;
	private String nomeMusica;
	private String artista;
	
	public Musica(int codigo, int nota, double tempoDeDuracao, String nomeMusica, String artista) {
		this.codigo = codigo;
		this.nota = nota;
		this.tempoDeDuracao = tempoDeDuracao;
		this.nomeMusica = nomeMusica;
		this.artista = artista;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}
}
