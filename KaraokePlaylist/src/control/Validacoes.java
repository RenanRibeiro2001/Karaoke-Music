package control;

import java.util.Random;

public class Validacoes {

	static Random numeroAleatorio = new Random();

	public static int darNota() {

		return numeroAleatorio.nextInt(101);

	}

	public boolean validarMusica(int num1, int num2) {
		boolean a = false;
		
		if(num1 <= num2) {
			a = true;
			
		}
		
		 return a;
	}

}
