package principal;

public class Visualizacao {
	
	private Gafanhoto expectador;
	private Video filme;
	
	
	public Visualizacao(Gafanhoto expectador, Video filme) {
		this.expectador = expectador;
		this.filme = filme;
		this.expectador.setTotAssistido(this.expectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porcentagem) {
		int tot = 0;
		
		if(porcentagem <=20) {
			tot = 3;
		}else if(porcentagem <=50){
			tot = 5;
		}else if(porcentagem <=80) {
			tot = 7;
		}else {
			tot = 10;
		}
		
		this.filme.setAvaliacao(tot);
		
	}
	
	public Gafanhoto getExpectador() {
		return expectador;
	}
	public void setExpectador(Gafanhoto expectador) {
		this.expectador = expectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [expectador=" + expectador + ", filme=" + filme + "]";
	}

}
