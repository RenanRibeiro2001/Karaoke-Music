package model;

public class Musica {

	private String nomeMusica;
	private	int nota;
	private Cantor cantor;
	
	public Musica(String nomeMusica, int nota, Cantor cantor) {
		this.cantor = cantor;
		this.nomeMusica = nomeMusica;
		this.nota = nota;
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
