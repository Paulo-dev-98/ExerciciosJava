package avaliacao1;

public class Jogador2 {  
	
	private String nome;
	private int Categoria;
	private String email;
	private String idade;
	
	public Jogador2(String nome, int categoria, String email, String idade) {
		super();
		this.nome = nome;
		Categoria = categoria;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return Categoria;
	}

	public void setCategoria(int categoria) {
		Categoria = categoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void subirClassificacao() {
		this.Categoria = Categoria++;
	}
	
}
