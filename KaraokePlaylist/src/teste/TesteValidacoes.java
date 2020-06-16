package teste;

import control.Validacoes;
import java.util.Scanner;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		Validacoes val = new Validacoes();
		if(val.ehNumero(a)) {
		int b = Integer.parseInt(a);
		System.out.println(b);
		}
		
	}
}
