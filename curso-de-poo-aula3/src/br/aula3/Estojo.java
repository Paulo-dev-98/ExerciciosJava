package br.aula3;

public class Estojo {
	private String modelo;
	private String cor;
	private int reparticoes;
	private boolean aberto;

	public Estojo(String modelo, String cor, int reparticoes) {

		this.setModelo(modelo);
		this.setCor(cor);
		this.setReparticoes(reparticoes);

	}

	void status() {

		System.out.println("um estojo " + this.cor);
		System.out.println("está aberto: " + this.aberto);
		System.out.println("modelo: " + this.modelo);
		System.out.println("numero de repartições: " + this.reparticoes);
	}

	void pegarMaterial() {

		if (this.aberto == true) {

			System.out.println("peguei um lapis");

		} else {
			System.out.println("esta fechado, não consigo pegar nada");
		}

	}

	public void abrir() {

		this.aberto = true;

	}

	public void fechar() {

		this.aberto = false;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getReparticoes() {
		return reparticoes;
	}

	public void setReparticoes(int reparticoes) {
		this.reparticoes = reparticoes;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

}
