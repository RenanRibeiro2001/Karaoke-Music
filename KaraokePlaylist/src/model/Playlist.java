package model;


import java.util.ArrayList;
import java.util.Scanner;

import control.Validacoes;

public class Playlist {
	
	public Playlist(){
		
	}
	
	private ArrayList<Musica> playlist = new ArrayList<Musica>();
	
	public void adicionarMusicaNaPlaylist(Musica musica, String cantor) {
				
		playlist.add(musica);
		musica.setCantor(new Cantor(cantor));
	
	}
	
	public void acabouAMusica() {
		
		playlist.get(0).setCantor(null);
		playlist.remove(0);
		
	}
	
	public void atrasarMusica(Musica musica) {
		
		for (int i = 0; i <= playlist.size(); i++) {
			if(musica == playlist.get(i)) {
				if(i == playlist.size()-1) {
					break;
				}
				else {
					playlist.remove(musica);
				}
			}
			else {
				System.out.println("Essa musica nao está na playlist");
			}
		}
	}
	
	public boolean adiantarMusica(Musica musica) {
		
		for (int i = 0; i <= playlist.size(); i++) {
			if(musica == playlist.get(i)) {
				if(i == 0) {
					return false;
				}
				else {
					playlist.remove(musica);
					
				}
			}
			else {
				System.out.println("Essa musica nao está na playlist");
				return false;
			}
		}
		return true;
	}

	public void tocarMusicaEspecifica(Musica musica) {
		System.out.println(musica.getCantor() + " está cantando " + musica.getNomeMusica());
	}
	
	public void mostrarMusicasDaPlaylist() {

		if(!playlist.isEmpty())	{
		
			for (int i = 0; i <= playlist.size(); i++) {
				System.out.println((i+1) + " - " + playlist.get(i).getNomeMusica() + " - " + playlist.get(i).getCantor());
			}
		}
	}

	public void tocarMusica() {
	
		System.out.println(playlist.get(0).getCantor() + " está cantando " + playlist.get(0).getNomeMusica());
	}
	
	public int tamanhoPlaylist() {
		return playlist.size();
	}
}
