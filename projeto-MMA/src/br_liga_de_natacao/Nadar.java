package br_liga_de_natacao;

import java.util.Random;

public class Nadar {
	private Nadador desafiado;
	private Nadador desanfiante;
	private int rounds;
	private boolean aprovado;

	public void marcarCompetição(Nadador n1, Nadador n2) {
		if (n1.getSexo() == n2.getSexo() && n1 != n2) {
			if (n1.getCategoria() == n2.getCategoria() && n1 != n2) {
				this.setAprovado(true);
				this.setDesafiado(n1);
				this.setDesanfiante(n2);
				System.out.println("A competição foi marcada com sucesso");
			} else {
				this.setAprovado(false);
				this.setDesafiado(null);
				this.setDesanfiante(null);
				System.out.println("impossivel marcar competição, os nadadores são de categorias diferentes");
			}
		} else {
			this.setAprovado(false);
			this.setDesafiado(null);
			this.setDesanfiante(null);
			System.out.println("impossivel marcar competição, os nadadores tem sexos diferentes");
		}

	}

	public void competir(Nadador n1, Nadador n2) {
		if (this.getAprovado() == true) {
			System.out.println("apresentando o desafiado: ");
			this.getDesafiado().apresentar();
			System.out.println("apresentando o desafiaate: ");
			this.getDesanfiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor) {
			case 0:
				System.out.println("Empatou");
				this.getDesafiado().empatar();
				this.getDesanfiante().empatar();
				break;
			case 1:
				System.out.println("Vitoria do: " + this.getDesafiado().getNome());
				this.getDesafiado().vencerDisputa();
				this.getDesanfiante().perderDisputa();
				break;
			case 2:
				System.out.println("Vitoria do:" + this.getDesanfiante().getNome());
				this.getDesafiado().perderDisputa();
				this.getDesanfiante().vencerDisputa();
				break;

			}
		}

	}

	public Nadador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Nadador desafiado) {
		this.desafiado = desafiado;
	}

	public Nadador getDesanfiante() {
		return desanfiante;
	}

	public void setDesanfiante(Nadador desanfiante) {
		this.desanfiante = desanfiante;
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
