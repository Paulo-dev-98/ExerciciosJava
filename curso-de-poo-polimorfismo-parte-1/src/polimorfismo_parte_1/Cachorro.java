package polimorfismo_parte_1;

public class Cachorro extends Mamifero implements Mascotes {
	
	public void reacao(String mensagem) {
		if(mensagem == "feio") {
			System.out.println("lata forte");
		}else {
			System.out.println("não sei");
		}
	}
	
	public void reacao(float hora) {
		if(hora <= 10.30f) {
			System.out.println("dormindo");
		}
	}
	
	public void reacao(int idade) {
		if(idade >= 12) {
			System.out.println("velho");
		} else if(idade < 12) {
			System.out.println("crescendo");
		}else {
			System.out.println("não sei kkkkkkk");
		}
	}
	
//	public void reacao() {
//		
//	}
	
	public void enterrarOsso() {
		System.out.println("enterrando osso");
	}
	
	public void morder() {
		System.out.println("morder");
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
