package model;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaKaraoke {
	private ArrayList<Musica> musicas = new ArrayList<Musica>();

	public static void main(String[] args) {
		MaquinaKaraoke maquina = new MaquinaKaraoke();
		maquina.start();
		
	}
	
	public void start() {
		musicas.add(new Musica(1, 2, 2.30, "Bad guy", "billie eilish"));
		musicas.add(new Musica(2, 3, 4.30, "Stonehenge", "Fresno"));
		musicas.add(new Musica(3, 5, 1.20, "chei de sal", "Mc gorila"));
	}
}