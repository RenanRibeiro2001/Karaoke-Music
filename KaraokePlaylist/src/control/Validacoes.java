package control;

import java.util.Random;

public class Validacoes {
	
	Random numeroAleatorio = new Random();
	
	public int darNota() {
		
		return numeroAleatorio.nextInt(5) + 1;
		
	}

	public void validarMusica() {
		
	}

}
