package polimorfismo_parte_1;

import javax.swing.JOptionPane;

public class TesteAlgoritimo {
	public static void main(String[] args) {

		int nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite uma nota"));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite uma nota"));
		int nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite uma nota"));
		int notaTotal = nota1 + nota2 + nota3;

      if(notaTotal >= 60) {
    	  System.out.println("invalido");
      } if(notaTotal < 40) {
    	  System.out.println("reprovado");
      } if(notaTotal > 100) {
    	  System.out.println("invalido");
      }

	}
}
