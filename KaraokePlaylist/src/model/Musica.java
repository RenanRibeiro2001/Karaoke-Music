package model;

public class Musica {

	private String nomeMusica;
	private	int nota;
	private Cantor cantor;
	private String artista;
	private float tempoDeDuracaoEmMinutos;
	private int codigo;
		
	public Musica(int codigo, String nomeMusica, int nota, Cantor cantor, String artista, float tempoDeDuracaoEmMinutos) {
		this.cantor = cantor;
		this.nomeMusica = nomeMusica;
		this.nota = nota;
		this.artista = artista;
		this.tempoDeDuracaoEmMinutos = tempoDeDuracaoEmMinutos;
		this.codigo = codigo;
		nota = 0;
	}

	public void notaMusica(int novaNota) {

		if (nota > 0) {

		} else {

			nota = (nota + novaNota) / 2;
		}
	}

	public String getNomeMusica() {
		return nomeMusica;
	}
	
	public double getNota() {
		return nota;
	}

	public Cantor getCantor() {
		return cantor;
	}
}
