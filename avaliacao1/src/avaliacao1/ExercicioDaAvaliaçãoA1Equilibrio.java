package avaliacao1;

import javax.swing.JOptionPane;

public class ExercicioDaAvaliaçãoA1Equilibrio {
    public static void main(String[] args) {
		
    	   int bolaA = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o peso da bola A"));
           int bolaB = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o peso da bola B"));
           int bolaC = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o peso da bola C"));
           int bolaD = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o peso da bola D"));

          if(bolaA == bolaB + bolaC + bolaD && bolaB + bolaC == bolaD && bolaB == bolaC){
              System.out.println("S");
          }else{
              System.out.println("N");
          }
    	
	}
}
