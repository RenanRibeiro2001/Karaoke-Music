package model;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaKaraoke {

	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Playlist playlist = new Playlist();
	
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
