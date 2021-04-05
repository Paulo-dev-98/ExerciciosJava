package br.mma;

public class Lutador{

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int numDeVitorias;
	private int numDeDerrotas;
	private int NumDeEmpates;
	
	public void apresentar() {
		System.out.println("Nome do Lutador: " + this.getNome());
		System.out.println("Nacionalidade do lutador: " + this.getNacionalidade());
		System.out.println("Idade do Lutador: " + this.getIdade());
		System.out.println("Altura do lutador: " + this.getAltura());
		System.out.println("O peso do lutador é: " + this.getPeso());
		System.out.println("O numero de vitorias desse lutar é: " + this.getNumDeVitorias());
		System.out.println("O numero de derrotas desse lutador é: " + this.getNumDeDerrotas());
		System.out.println("O numero de empates desse lutador é: " + this.getNumDeEmpates());

	}

	
	public void status() {
		System.out.println("Nome do Lutador: " + this.getNome());
		System.out.println("O peso do lutador é: " + this.getPeso() + "e é da categoria: " + this.getCategoria());
		System.out.println("O numero de vitorias desse lutar é: " + this.getNumDeVitorias());
		System.out.println("O numero de derrotas desse lutador é: " + this.getNumDeDerrotas());
		System.out.println("O numero de empates desse lutador é: " + this.getNumDeEmpates());
	}

	
	public void ganharLuta() {
		this.setNumDeVitorias(this.getNumDeVitorias() + 1);

	}

	
	public void perderLuta() {
		this.setNumDeDerrotas(this.getNumDeDerrotas() + 1);

	}

	
	public void empatarLuta() {
		this.setNumDeEmpates(this.getNumDeEmpates() + 1);

	}
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int numDeVitorias,
			int numDeDerrotas, int numDeEmpates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setNumDeVitorias(numDeVitorias);
		this.setNumDeDerrotas(numDeDerrotas);
		this.setNumDeEmpates(numDeEmpates);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "invalido";
		} else if (this.peso <= 70.3) {
			this.categoria ="Leve";
		} else if (this.peso <= 80.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "pesado";
		} else {
			this.categoria = "invalido";
		}
	}

	public int getNumDeVitorias() {
		return numDeVitorias;
	}

	public void setNumDeVitorias(int numDeVitorias) {
		this.numDeVitorias = numDeVitorias;
	}

	public int getNumDeDerrotas() {
		return numDeDerrotas;
	}

	public void setNumDeDerrotas(int numDeDerrotas) {
		this.numDeDerrotas = numDeDerrotas;
	}

	public int getNumDeEmpates() {
		return NumDeEmpates;
	}

	public void setNumDeEmpates(int numDeEmpates) {
		NumDeEmpates = numDeEmpates;
	}



	
	

}
