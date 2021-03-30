package projeto_soma;

import java.util.Scanner;

public class TesteSoma {
	public static void main(String[] args) {
	    
//		Scanner teclado = new Scanner(System.in);
//		System.out.print("digite um numero arrombado: ");
//		int n1 = teclado.nextInt();
//		System.out.print("digite outro arrombado: ");
//		int n2 = teclado.nextInt();
//		int soma = n1 + n2;
//		System.out.println("A soma dos valores é: " + soma);
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("digite seu ano de nascimento arrombado: ");
		int ano = teclado.nextInt();
		System.out.print("digite o ano atual arrombado: ");
		int anoAtual = teclado.nextInt();
		int calculo = anoAtual - ano;
		System.out.println("Sua idade é: " + calculo + "anos");{
			if(calculo >= 23) {
				System.out.println("você esta velho");
			} else {
				System.out.println("vc é novo!");
			}
			
		}
		
		

		
		
	}
	
	

}
