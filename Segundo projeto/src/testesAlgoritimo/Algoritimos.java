

package testesAlgoritimo;

import java.util.Scanner;

public class Algoritimos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("digite seu nome arrombado: ");
		String nome = teclado.nextLine();
		System.out.print("digite sua nota arrombado: ");
		float nota = teclado.nextFloat();
		System.out.printf("A note de %s é %.2f \n " , nome, nota );

	}

}
