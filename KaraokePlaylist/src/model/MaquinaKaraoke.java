package model;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaKaraoke {
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private int escolha;
	private int repetir = 1;
	Scanner scan = new Scanner(System.in);
	
	// new Thread().sleep(1000);

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
			System.out.println("3) Sair");
			escolha = scan.nextInt();
			switch (escolha) {
			case  1:{
				
			}
			}
		}
	}
}