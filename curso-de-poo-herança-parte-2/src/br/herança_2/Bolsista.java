package br.herança_2;

public class Bolsista extends Aluno {
	
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("renovando bolsa");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println( this.getNome() + " é bolsista e tem disconto de 10%");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
