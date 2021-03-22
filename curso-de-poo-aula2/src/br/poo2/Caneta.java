package br.poo2;

//classe
public class Caneta {
	
	//atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	//metodos
	public void status() {
		
		System.out.println("uma caneta " + this.cor);
		System.out.println("está tampada: " + this.tampada);
		System.out.println("modelo: " + this.modelo);
		System.out.println("ponta: " + this.ponta);
		System.out.println("carga: " + this.carga);
	}
	
	public void rabiscar() {
		
		if(this.tampada == true) {
			System.out.println("Não posso rabiscar, a caneta esta tampada");
		}else {
			System.out.println("estou rabiscando");
		}
		
	}
	
	public void tampar() {
		this.tampada = true;
		
	}
	
	public void destampar() {
		this.tampada = false;
	}

}
