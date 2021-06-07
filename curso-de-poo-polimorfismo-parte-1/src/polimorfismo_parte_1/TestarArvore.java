package polimorfismo_parte_1;

public class TestarArvore {

	public static void main(String[] args) {

		Mamifero m1 = new Mamifero();
		m1.setCorDaPele("preto");
		m1.setIdade(12);
		m1.setMembros(4);
		m1.setPeso(25.5f);
		System.out.println(m1.getCorDaPele());
		System.out.println(m1.getMembros() + " patas");
		m1.locomover();
		m1.alimentar();
		m1.emitirSom();
		
		Cachorro c1 = new Cachorro();
		c1.abanarRabo();
		c1.setCorDaPele("branco");
		c1.locomover();
		c1.brincar();
		
		Pinguim p1 = new Pinguim();
		p1.locomover();
		
		Tubarao t1 = new Tubarao();
		t1.alimentar();
		
		
	}

}
