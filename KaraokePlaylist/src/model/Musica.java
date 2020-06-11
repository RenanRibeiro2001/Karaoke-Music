package model;

public class Musica {
	
	private int codigo;
	private int nota;
	private double tempoDeDuracao;
	private String nomeMusica;
	private String artista;
	private Cantor cantor;
	
	public Musica(int codigo, String nomeMusica, String artista, double tempoDeDuracao,int nota) {
		this.codigo = codigo;
		this.nota = nota;
		this.tempoDeDuracao = tempoDeDuracao;
		this.nomeMusica = nomeMusica;
		this.artista = artista;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}
	
	public int getNota() {
		return nota;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public Cantor getCantor() {
		return cantor;
	}
	public String getArtista() {
		return artista;
	}
	 
	public void setCantor(Cantor cantor) {

		this.cantor = cantor;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
}
