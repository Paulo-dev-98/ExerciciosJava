package polimorfismo_parte_1;

public class Cachorro extends Mamifero implements Mascotes {
	
	public void enterrarOsso() {
		System.out.println("enterrando osso");
	}

	public void abanarRabo() {
		System.out.println("abanando o rabo");
	}
	
	@Override
	public void locomover() {
		System.out.println("os cachorros se locomovem andando e correndo");
	}

	@Override
	public void brincar() {
		System.out.println("brincando com o dono");
		
	}

	@Override
	public void TomarBanho() {
		System.out.println("tomando banho");
		
	}

	@Override
	public void passearComODono() {
		System.out.println("passeando com o dono");
		
	}

}
