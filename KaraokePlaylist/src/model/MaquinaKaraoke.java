package model;

import java.util.ArrayList;
import java.util.Scanner;
import control.Validacoes;

public class MaquinaKaraoke {
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private String escolhaTemp;
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
		musicas.add(new Musica(6, "AK do Flamengo", "NGC Borges", 2.30, 70));
		musicas.add(new Musica(7, "Flow 07", "Sidoka", 3.40, 90));
		musicas.add(new Musica(8, "Robbers", "The 1975", 4.20, 75));
		musicas.add(new Musica(9, "Espiã", "Sidoka", 2.10, 90));
		musicas.add(new Musica(10, "Ela Adora Veneno", "Sidoka", 3.50, 80));
		musicas.add(new Musica(11, "É Natural", "Ferrugem", 3.10, 95));
		musicas.add(new Musica(12, "Tem Café", "Gaab", 2.10, 70));
		musicas.add(new Musica(13, "Espanha", "Sidoka", 2.30, 95));
		musicas.add(new Musica(14, "Má Intenção", "Sidoka", 4.10, 90));
		musicas.add(new Musica(15, "Godzilla", "Eminem", 3.00, 80));
		musicas.add(new Musica(16, "Sad", "XXXTentacion", 2.00, 80));
		musicas.add(new Musica(17, "XO Tour Llif3", "Lil Uzi Vert", 4.10, 95));
		musicas.add(new Musica(18, "Kenny G", "Matuê", 2.50, 96));
		musicas.add(new Musica(19, "Luxuria", "Xamã", 3.10, 85));
		musicas.add(new Musica(20, "N.A.D.A.B.O.M.", "Costa Gold", 4.10, 90));
		
		mostrarCatalogo();	
		menu();
		
	}
	
	public void mostrarCatalogo(){
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
			System.out.println("4) Mostrar Catalogo");
			System.out.println("5) Sair");
			System.out.println();
			escolhaTemp = scan2.nextLine();
			if(validacoes.ehNumero(escolhaTemp)) {
				escolha = Integer.parseInt(escolhaTemp);
			}
			
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
							escolhaTemp = scan2.nextLine();
							if(validacoes.ehNumero(escolhaTemp)) {
								repetir = Integer.parseInt(escolhaTemp);
							}
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
				while(!playlist.playlistVazia()) {
					if(!playlist.playlistVazia()) {
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
							if(atrasarOuAdiantarMusica == 1) {        //ADIANTAR MUSICA
								System.out.println();
								System.out.println("Digite o numero da Música que deseja adiantar");
								System.out.println();
								escolhaTemp = scan2.nextLine();
								int codigo;
								if(validacoes.ehNumero(escolhaTemp)) {
									codigo = Integer.parseInt(escolhaTemp);
								}
								else {
									break;
								}
								playlist.adiantarMusica(codigo);
								System.out.println();
							}
							else if(atrasarOuAdiantarMusica == 2) {    //ATRASAR MUSICA
								System.out.println();
								System.out.println("Digite o numero da Música que deseja atrasar");
								System.out.println();
								escolhaTemp = scan2.nextLine();
								int codigo;
								if(validacoes.ehNumero(escolhaTemp)) {
									codigo = Integer.parseInt(escolhaTemp);
								}
								else {
									break;
								}
								playlist.atrasarMusica(codigo);
							}
							playlist.mostrarMusicasDaPlaylist();
							index++;
						}
					}
					else{
						System.out.println();
						System.out.println("Playlist vazia");
						System.out.println();
						break;
					}
				}
				break;
				
			case 4:
				mostrarCatalogo();
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