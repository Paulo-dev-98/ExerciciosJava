package br.mma;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovado(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
			System.out.println("A luta foi marcada");
		} else {
			this.setAprovado(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("impossivel marcar luta");
		}

	}

	public void lutar() {
		if (this.getAprovado() == true) {
			System.out.println("###Desafiado###");
			this.getDesafiado().apresentar();
			System.out.println("###Desafiante###");
			this.getDesafiante().apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor) {
			case 0:
				System.out.println("Empatou");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			case 1:
				System.out.println("Vitoria do: " + this.getDesafiado().getNome());
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
			case 2:
				System.out.println("Vitoria do:" + this.getDesafiante().getNome());
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;

			}
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
