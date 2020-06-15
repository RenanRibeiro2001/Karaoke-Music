package model;

import java.util.ArrayList;
import java.util.Scanner;
import control.Validacoes;

public class MaquinaKaraoke {
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private int escolha;
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Playlist playlist = new Playlist();
	Validacoes validacoes = new Validacoes();

	public static void main(String[] args) {
		MaquinaKaraoke maquina = new MaquinaKaraoke();
		maquina.start();
	}
	
	public void start() {
		musicas.add(new Musica(1, "Bad Guy", "Billie Eilish", 3.40, 80));
		musicas.add(new Musica(2, "NAV", "Jovem Dex", 3.20, 75));
		musicas.add(new Musica(3, "Love and Choppa", "NGC Daddy", 2.30, 90));
		musicas.add(new Musica(4, "Drink", "Sidoka", 2.20, 80));
		musicas.add(new Musica(5, "La Chica", "NGC Daddy", 3.10, 98));
		musicas.add(new Musica(6, "AK do Flamengo", "NGC Borges", 2.30, 70)); // to ouvindo renan
		musicas.add(new Musica(7, "Flow 07", "Sidoka", 3.40, 90));
		musicas.add(new Musica(8, "Robbers", "The 1975", 4.20, 75));
		musicas.add(new Musica(9, "Espiã", "Sidoka", 2.10, 90));
		
		mostrarMusicas();	
		menu();
		
	}
	
	public void mostrarMusicas(){
		for (int i = 0; i < musicas.size(); i++) {
			System.out.println(musicas.get(i).getCodigo() + " - " + musicas.get(i).getNomeMusica());
		}
	}
	
	public void menu() {
		
		int repetir = 1;
		while (repetir == 1) {
			System.out.println();
			System.out.println("Oque deseja fazer?");
			System.out.println("1) Adicionar Musica na Playlist"); 
			System.out.println("2) Ver Musicas na Playlist");
			System.out.println("3) Tocar Playlist");
			System.out.println("4) Mostrar Opções de Musicas");
			System.out.println("5) Sair");
			System.out.println();
			escolha = scan.nextInt();
			
			switch (escolha) {
			case  1:
				
				repetir = 2;
					while(repetir == 2) {
						System.out.println("Qual o numero da musica voce deseja adicionar a playlist?");
						int temp = scan.nextInt() - 1;
						if(validacoes.validarMusica(temp, musicas.size())) {
							System.out.println();
							System.out.println("Quem ira cantar essa musica?");
							System.out.println();
							String cantor = scan2.nextLine();
							playlist.adicionarMusicaNaPlaylist(musicas.get(temp), cantor);
							System.out.println();
							System.out.println("Deseja adicionar mais alguma musica na playlist?");
							System.out.println("1) Não");
							System.out.println("2) Sim");
							System.out.println();
							repetir = scan.nextInt();
						}
						else {
							System.out.println("Essa música não existe, tente novamente!");
							System.out.println();
						}
					}
				repetir = 1;
				break;
			
			case 2:
				
				playlist.mostrarMusicasDaPlaylist();
				break;
				
			case 3:
				int index = 0;
				while(index != playlist.tamanhoPlaylist()) {
					playlist.tocarMusica();
					musicas.get(index).setNota(validacoes.darNota());
					System.out.println("nota: " + musicas.get(index).getNota());
					playlist.acabouAMusica();
					playlist.mostrarMusicasDaPlaylist();
					System.out.println();
					System.out.println("Deseja fazer alguma alteração na playlist?");
					System.out.println("1) Não");
					System.out.println("2) Sim");
					System.out.println();
					int fazerOuNaoAlteracoesNaPlaylist = scan.nextInt();
					if(fazerOuNaoAlteracoesNaPlaylist == 1) {
						index++;
					}
					else if(fazerOuNaoAlteracoesNaPlaylist == 2) {
						System.out.println();
						System.out.println("1) Adiantar Musica");
						System.out.println("2) Atrasar Musica");
						System.out.println();
						int atrasarOuAdiantarMusica = scan.nextInt();
						if(atrasarOuAdiantarMusica == 1) {
							System.out.println();
							System.out.println("Digite o numero da Música que deseja adiantar");
							System.out.println();
							int codigo = scan2.nextInt();
							playlist.adiantarMusica(codigo);
							System.out.println();
						}
						else if(atrasarOuAdiantarMusica == 2) {
							System.out.println();
							System.out.println("Digite o codigo da musica que deseja atrasar");
							System.out.println();
							int codigo = scan.nextInt();
							playlist.atrasarMusica(musicas.get(codigo));
						}
						playlist.mostrarMusicasDaPlaylist();
						index++;
					}
				}
				break;
				
			case 4:
				mostrarMusicas();
				break;
				
			case 5: 
				repetir = 0;
				break;
				
			default:
				System.out.println();
				System.out.println("Digite somente digitos de 1 a 5");
			}
		}
	}
}