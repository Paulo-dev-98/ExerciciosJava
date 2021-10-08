package avaliacao1;

public class Jogo {
    public static void main(String[] args) {
		Jogador h1 = new Jogador("Henriqie", 25, "novato", "henriquedoido@gmail.com");
		
		System.out.println(h1.toString());
		
		Arma cajado1 = new Arma("Cajado de Belphus", "Trevas", "Elemental das Trevas", 98.4f);
		
		System.out.println(cajado1.toString());
		
		Personagem p1 = new Personagem("Eloel", "Mago", "Trevas", "Abbadon");
		
		System.out.println(p1.toString());
		
		cajado1.subirNivel();
		
		System.out.println(cajado1.toString());
	}
}
