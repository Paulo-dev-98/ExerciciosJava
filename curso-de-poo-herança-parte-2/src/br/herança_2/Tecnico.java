package br.herança_2;

public class Tecnico extends Aluno {
	
	private int registroProfissional;

	public void praticar() {
		System.out.println("aluno praticando " + getNome());
		
	}
	
	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	@Override
	public String toString() {
		return "Dados [nome = " + getNome() + ", idade = " + getIdade() + ", sexo = " + getSexo() + ", registro = " + getRegistroProfissional() + "]";
	}
	
}
