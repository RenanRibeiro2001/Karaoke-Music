package model;

import java.util.ArrayList;
import java.util.Scanner;
import control.Validacoes;

public class MaquinaKaraoke {
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private int escolha;
	private int repetir = 1;
	Scanner scan = new Scanner(System.in);
	Playlist playlist = new Playlist();
	Validacoes validacoes = new Validacoes();
	MaquinaKaraoke maquina = new MaquinaKaraoke();
	
	//Thread.currentThread().sleep(1000);

	public static void main(String[] args) {
		MaquinaKaraoke maquina = new MaquinaKaraoke();
		maquina.start();
		maquina.mostrarMusicas();
		
	}
	
	public void start() {
		musicas.add(new Musica(1, "Bad Guy", "Billie Eilish", 3.40, 0));
		musicas.add(new Musica(2, "NAV", "Jovem Dex", 3.20, 0));
		musicas.add(new Musica(3, "Love and Choppa", "NGC Daddy", 2.30, 0));
	}
	
	public void mostrarMusicas(){
		for (int i = 0; i <= musicas.size(); i++) {
			System.out.println(musicas.get(i).getCodigo() + " - " + musicas.get(i).getNomeMusica());
		}
	}
	
	public void menu() {
		while (repetir == 1) {
			System.out.println("Suas Opções: ");
			System.out.println("1) Adicionar Musica na Playlist"); 
			System.out.println("2) Ver Musicas na Playlist");
			System.out.println("3) Tocar Playlist");
			System.out.println("4) Mostrar Opções de Musicas");
			System.out.println("5) Sair");
			escolha = scan.nextInt();
			
			switch (escolha) {
			case  1:
				
				repetir = 2;
					while(repetir == 2) {
						System.out.println("Qual o numero da musica voce deseja adicionar a playlist?");
						int temp = scan.nextInt() - 1;
						if(validacoes.validarMusica(temp, musicas.size())) {
							System.out.println("Quem ira cantar essa musica?");
							String cantor = scan.nextLine();
							playlist.adicionarMusicaNaPlaylist(musicas.get(temp), cantor);
							System.out.println("Deseja adicionar mais alguma musica na playlist?");
							System.out.println("1) Não");
							System.out.println("2) Sim");
							repetir = scan.nextInt();
						}
						else {
							System.out.println("Esa música não existe, tente novamente!");
						}
					}
				repetir = 1;
				break;
			
			case 2:
				
				playlist.mostrarMusicasDaPlaylist();
				break;
				
			case 3:
				int x = 0;
				while(x != playlist.tamanhoPlaylist()) {
					playlist.tocarMusica();
					musicas.get(x).setNota(validacoes.darNota());
					System.out.println("nota: " + musicas.get(x).getNota());
					playlist.acabouAMusica();
					playlist.mostrarMusicasDaPlaylist();
					System.out.println("Deseja fazer alguma alteração na playlist?");
					System.out.println("1) Não");
					System.out.println("2) Sim");
					int y = scan.nextInt();
					if(y == 1) {
						x++;
					}
					else if(y == 2) {
						System.out.println("1) Adiantar Musica");
						System.out.println("2) Atrasar Musica");
						int z = scan.nextInt();
						if(z == 1) {
							maquina.mostrarMusicas();
							System.out.println("Digite o codigo da musica que deseja adiantar");
							int codigo = scan.nextInt();
							if(playlist.adiantarMusica(musicas.get(codigo))) {
								playlist.tocarMusicaEspecifica(musicas.get(codigo));								
							}
							playlist.mostrarMusicasDaPlaylist();
						}
						else if(z == 2) {
							maquina.mostrarMusicas();
							System.out.println("Digite o codigo da musica que deseja atrasar");
							int codigo = scan.nextInt();
							playlist.atrasarMusica(musicas.get(codigo));
						}
						playlist.mostrarMusicasDaPlaylist();
						x++;
					}
				}
				
			}
		}
	}
}