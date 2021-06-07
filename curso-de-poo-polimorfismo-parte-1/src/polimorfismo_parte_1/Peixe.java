package polimorfismo_parte_1;

public class Peixe extends Animal {
	
	private String corDaEscama;

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

	@Override
	public void locomover() {
		System.out.println("nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo substancias");
		
	}

	@Override
	public void emitirSom() {
	  System.out.println("peixe não faz som");
		
	}
	
	public void soltarBolhas() {
		System.out.println("soltando bolhas");
	}

}
