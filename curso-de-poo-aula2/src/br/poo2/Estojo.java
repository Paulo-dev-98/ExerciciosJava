package br.poo2;

public class Estojo {
	public String modelo;
	public String cor;
	public int reparticoes;
	private boolean aberto;

	void status() {

		System.out.println("um estojo " + this.cor);
		System.out.println("est� aberto: " + this.aberto);
		System.out.println("modelo: " + this.modelo);
		System.out.println("numero de reparti��es: " + this.reparticoes);
	}

	void pegarMaterial() {

		if (this.aberto == true) {

			System.out.println("peguei um lapis");

		} else {
			System.out.println("esta fechado, n�o consigo pegar nada");
		}

	}

	public void abrir() {

		this.aberto = true;

	}

	public void fechar() {

		this.aberto = false;

	}

}
