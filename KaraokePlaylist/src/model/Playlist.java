package model;

import java.util.ArrayList;
import java.util.Scanner;

import control.Validacoes;

public class Playlist {
	
	private ArrayList<Musica> musica = new ArrayList<Musica>();
	Scanner scan = new Scanner(System.in);
	
	
	public void adicionarMusica() {
		System.out.println("Digite o seu nome");
		String nomeCantor = scan.nextLine();
		Cantor cantor = new Cantor(nomeCantor);
		
		System.out.println("Digite o nome de uma musica");
		String nomeMusica = scan.nextLine();
		musica.add(new Musica(nomeMusica, Validacoes.darNota(), cantor));
		
		System.out.println("o cantor " + cantor.getNome() + " pediu a musica: " + nomeMusica + " foi adicionada na playlist");
	}

	public void mostrarMusicasPlaylist() {
		System.out.println("As musicas que estão na playlist são: ");
		for (Musica x : musica) {
			System.out.println("Cantor: " + x.getCantor().getNome() + " Musica: " + x.getNomeMusica() + " Nota: " + x.getNota());
		}
	}

}
