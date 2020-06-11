package model;

import java.util.ArrayList;
import java.util.Scanner;

import control.Validacoes;

public class Playlist {
	
	private ArrayList<Musica> playlist = new ArrayList<Musica>();
	
	public void adicionarMusicaNaPlaylist(Musica musica) {
		playlist.add(musica);
	}
	
	public void AcabouAMusica() {
		
		playlist.remove(0);
	}
}
