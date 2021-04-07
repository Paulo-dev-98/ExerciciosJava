package br.mma;

public class TesteLutador {
	public static void main(String[] args) {
       
		Lutador l[] = new Lutador[6];
	    l[0] = new Lutador("Satã", "Inferno", 666, 98.8f, 118.8f, 666, 0,0 );
	    l[1] = new Lutador("Odin","Valhala", 500, 98.5f, 98.7f, 98, 50 ,42 );
	    l[2] = new Lutador("Osiris","Nut", 456, 88.5f, 68.7f, 78, 55 ,42 );
	    l[3] = new Lutador("Belzebu","inferno", 218, 98.5f, 98.7f, 98, 50 ,12 );
	    l[4] = new Lutador("Baah","Inferno", 456, 98.5f, 98.7f, 98, 50 ,22 );
	    l[5] = new Lutador("Loki","Valhala", 558, 98.5f, 57.7f, 98, 50 ,32 );
	   
	   
	  Luta luta1 = new Luta();
	  luta1.marcarLuta(l[3], l[5]);
	  luta1.lutar();
	 
	}

}
