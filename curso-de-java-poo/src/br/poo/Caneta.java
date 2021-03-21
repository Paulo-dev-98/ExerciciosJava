package br.poo;

//classe
public class Caneta {
	
	//atributos
	String modelo;
	String Cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//metodos
	void status() {
		
		System.out.println("uma caneta " + this.Cor);
		System.out.println("está tampada: " + this.tampada);
		System.out.println("modelo: " + this.modelo);
		System.out.println("ponta: " + this.ponta);
		System.out.println("carga: " + this.carga);
	}
	
	void rabiscar() {
		
		if(this.tampada == true) {
			System.out.println("Não posso rabiscar, a caneta esta tampada");
		}else {
			System.out.println("estou rabiscando");
		}
		
	}
	
	void tampar() {
		this.tampada = true;
		
	}
	
	void destampar() {
		this.tampada = false;
	}

}
