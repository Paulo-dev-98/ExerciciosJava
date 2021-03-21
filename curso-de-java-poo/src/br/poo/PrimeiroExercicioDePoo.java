package br.poo;

public class PrimeiroExercicioDePoo {
	
	public static void main(String[] args) {
		
		//criando objetos
		Caneta c1 = new Caneta();
		
		//instanciando objetos
		c1.Cor = "preta";
		c1.ponta = 0.7f;
	    c1.carga = 90;
		c1.modelo = "big";
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.Cor = "verde";
		c2.modelo = "sei lá";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		Estojo est = new Estojo();
		est.reparticoes = 3;
		est.cor = "verde";
		est.modelo = "não sei";
		est.abrir();
		est.status();
		est.pegarMaterial();
		
		
	}

}
