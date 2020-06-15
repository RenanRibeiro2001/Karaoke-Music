package model;


import java.util.ArrayList;
import java.util.Scanner;

import control.Validacoes;

public class Playlist {
	
	public Playlist(){
		
	}
	Validacoes validacoes = new Validacoes();
	private ArrayList<Musica> playlist = new ArrayList<Musica>();
	
	public void adicionarMusicaNaPlaylist(Musica musica, String cantor) {
				
		playlist.add(musica);
		musica.setCantor(new Cantor(cantor));
	
	}
	
	public void acabouAMusica() {
		
		playlist.get(0).setCantor(null);
		playlist.remove(0);
		
	}
	
	public void atrasarMusica(int numeroMusica) {
		
		if(numeroMusica <= playlist.size()) {
			if(numeroMusica - 1 == playlist.size()) {
				System.out.println("Voc� n�o pode adiar a ultima m�sica");
			}
			else {
				Musica temp = playlist.get(numeroMusica-1);
				playlist.remove(numeroMusica-1);
				playlist.add(temp);
			}
		}
		
		
		/*boolean entreiNoIf = false;
		for (int i = 0; i < playlist.size(); i++) {
			if(musica == playlist.get(i)) {
				entreiNoIf = true;
				if(i == playlist.size()-1) {
					break;
				}
				else {
					playlist.remove(musica);
				}
			}
			if(!entreiNoIf) {
				System.out.println("Essa musica nao est� na playlist");
			}
		}
		*/
	}
	
	public void adiantarMusica(int numeroMusica) {
		
		if(numeroMusica <= playlist.size()) {
			if(numeroMusica - 1 == 0) {
				System.out.println("Voc� n�o pode adiantar a primeira M�sica!");
			}
			else {
				tocarMusicaEspecifica(playlist.get(numeroMusica-1));
				playlist.remove(numeroMusica-1);
			}
		}
	}

	public void tocarMusicaEspecifica(Musica musica) {
		System.out.println(musica.getCantor().getNome() + " est� cantando " + musica.getNomeMusica());
		musica.setNota(validacoes.darNota());
		System.out.println("nota: " + musica.getNota());
		System.out.println();
	}
	
	public void mostrarMusicasDaPlaylist() {
		System.out.println("Proxima(s) M�sica(s):");
		if(!playlist.isEmpty())	{
		
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println();
				System.out.println((i+1) + " - " + playlist.get(i).getNomeMusica() + " - " + playlist.get(i).getCantor().getNome() +
						" - Maior nota da musica: " + playlist.get(i).getMaiorNota());
				//System.out.println("Primeira m�sica: " + playlist.get(i).getNomeMusica());
			}
		}
		else {
			System.out.println("Playlist Vazia");
			System.out.println();
		}
		System.out.println();
	}

	public void tocarMusica() {
	
		System.out.println(playlist.get(0).getCantor().getNome() + " est� cantando " + playlist.get(0).getNomeMusica());
	}
	
	public int tamanhoPlaylist() {
		return playlist.size();
	}
	
	public boolean playlistVazia() {
		return playlist.isEmpty();
	}
}
