package polimorfismo_parte_1;

public class Mamifero extends Animal implements Caracteristicas{
	
	private String corDaPele;

	@Override
	public void locomover() {
		System.out.println("Os mamiferos se locomovem correndo");
	}

	@Override
	public void alimentar() {
	System.out.println("mamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mamifero");
		
	}

	public String getCorDaPele() {
		return corDaPele;
	}

	public void setCorDaPele(String corDaPele) {
		this.corDaPele = corDaPele;
	}

}
