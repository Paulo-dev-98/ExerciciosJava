package br_liga_de_natacao;

public class Nadador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private String sexo;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public void apresentar() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("O nome do(a) nadador(a) é: " + this.getNome());
		System.out.println("A nacionalidade do(a) nadador(a) é:" + getNacionalidade());
		System.out.println("O sexo do(a) nadador(a) é:" + getSexo());
		System.out.println("A idade do(a) nadador(a) é:" + getIdade());
		System.out.println("A categoria do(a) nadador(a) é:" + getCategoria());
		System.out.println("O numero de vitorias do(a) nadador(a) é:" + getVitorias());
		System.out.println("O numero de derrotas do(a) nadador(a) é:" + getDerrotas());
		System.out.println("O numero de empates do(a) nadador(a) é:" + getEmpates());
		System.out.println("--------------------------------------------------------------");

	}

	public void status() {
		System.out.println("######################################");
		System.out.println("O nome do(a) nadador(a) é: " + this.getNome());
		System.out.println("O numero de vitorias do(a) nadador(a) é:" + getVitorias());
		System.out.println("O numero de derrotas do(a) nadador(a) é:" + getDerrotas());
		System.out.println("O numero de empates do(a) nadador(a) é:" + getEmpates());
		System.out.println("######################################");
	}

	public void vencerDisputa() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderDisputa() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatar() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public Nadador(String nome, String nacionalidade, int idade, String sexo) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setSexo(sexo);

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
		this.setCategoria();
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.idade < 10) {
			this.categoria = "invalido";
		} else if (this.idade <= 15) {
			this.categoria = "Infantil";
		} else if (this.idade <= 21) {
			this.categoria = "Jovem";
		} else if (this.idade >= 22 && this.idade <= 50) {
			this.categoria = "Adulto";

		} else {
			System.out.println("invalido");
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
