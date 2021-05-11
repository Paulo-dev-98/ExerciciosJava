package br.herança_2;

public class Professor extends Pessoa{
	
	private String especialidade;
	private float salario;
	
	public Professor(float salario, String especialidade) {
		
		this.setSalario(salario);
		this.setEspecialidade(especialidade);
		
	}
	
	public void receberAumento(float valorDoAumento) {
		this.setSalario(getSalario() + valorDoAumento);
	}
	
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Dados [nome = " + getNome() + ", idade = " + getIdade() + ", sexo = " + getSexo() + ", salario = " + getSalario() + "]";
	}
	
	

}
