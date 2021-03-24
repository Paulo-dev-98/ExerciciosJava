package br.aula3;

public class Aula03 {
	public static void main(String[] args) {
      Caneta c1 = new Caneta("a la satanas", "preta", 0.7f);
      c1.status();
      
      Estojo es = new Estojo("a la satanas", "preto", 3);
     
      es.abrir();
      es.status();
      es.pegarMaterial();
      
      //      c1.setModelo("bic 4 cores");
//      c1.setPonta(0.7f);
//      //c1.status();
//      System.out.println("tenho uma caneta: " + c1.getModelo() + " e sua ponta de de: " + c1.getPonta() + "!");
      
      
	}
}
