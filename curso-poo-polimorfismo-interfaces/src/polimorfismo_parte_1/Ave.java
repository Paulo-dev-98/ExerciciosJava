package polimorfismo_parte_1;

public class Ave extends Animal implements Caracteristicas{
	
	private String corDaPena;
	

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}

	@Override
	public void locomover() {
		System.out.println("voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("sons de ave");
		
	}
	
	public void construirNinho() {
		System.out.println("construindo um ninho");
	}

}
