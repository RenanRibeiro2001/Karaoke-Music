package model;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaKaraoke {

	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Playlist playlist = new Playlist();
	private ArrayList<Musica> listaDeMusicas = new ArrayList<>();
	
	// lista de musicas
	
	//listaDeMusicas.add(new Musica(1, "NAV", 0, null, "Jovem Dex", (float) 2.43));
	
	
	
	Musica robbers = new Musica(2, "Robbers", 0, null, "The 1975", (float) 4.32);
	
	
	private int escolha;
	private int repetir = 1;
	
	public void menu() {
		while (repetir == 1) {
			System.out.println("Bem-Vindo a Maquina de Karaoke");
			System.out.println("1) Adicionar Musica na Playlist"); // ele nao cria uma nova musica, apenas adiciona uma existente na playlist
			System.out.println("2) Ver Musicas Playlist");
			System.out.println("3) Sair");
			escolha = scan.nextInt();
			switch (escolha) {
			case 1:
				playlist.adicionarMusica();
				break;
			case 2:
				playlist.mostrarMusicasPlaylist();
				break;
			case 3:
				repetir = 0;
				break;
			}
		}
	}
}
