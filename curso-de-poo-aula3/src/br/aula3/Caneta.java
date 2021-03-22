package br.aula3;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String m, String c, float p) {
		
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
		

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String c) {
		this.cor = c;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public void status() {
		System.out.println("Sobre a caneta");
		System.out.println("modelo " + this.getModelo());
		System.out.println("ponta " + this.getPonta());
		System.out.println("cor: " + this.cor);
		System.out.println("tampada: " + this.tampada);
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampada() {
		this.tampada = false;
	}

}
