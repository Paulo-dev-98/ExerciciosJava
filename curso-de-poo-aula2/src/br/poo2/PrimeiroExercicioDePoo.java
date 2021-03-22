package br.poo2;

public class PrimeiroExercicioDePoo {
	
	public static void main(String[] args) {
		
		//criando objetos
		Caneta c1 = new Caneta();
		c1.modelo = "satanas dos infernos";
		c1.cor = "preto";
		c1.carga = 65;
		//c1.tampada = false;
		c1.tampar();
		c1.rabiscar();
		c1.status();
		
		Estojo est = new Estojo();
		est.modelo = "satanas dos infernos";
		est.cor = "preto";
		est.reparticoes = 3;
		est.abrir();
		est.status();
		est.pegarMaterial();
		
		
	}

}
