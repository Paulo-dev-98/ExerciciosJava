package polimorfismo_parte_1;


public class Reptil extends Animal implements Caracteristicas{
	
	private String corDaEscama;

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

	@Override
	public void locomover() {
		System.out.println("rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo vegetais e ovos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("sons de reptil");
		
	}

}
