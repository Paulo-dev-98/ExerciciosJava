package avaliacao1;

public class Jogador {
    private String nome;
    private int idade;
    private int categoria;
    private String email;
    private boolean ganhou;
    
	public Jogador(String nome, int idade, int categoria, String email) {
		this.nome = nome;
		this.idade = idade;
		this.categoria = categoria;
		this.email = email;
	}
	
	public void realizarPartida(boolean ganhou) {
		if(ganhou == true) {
			setCategoria(getCategoria() +1);
		}else {
			setCategoria(getCategoria() - 1);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", idade=" + idade + ", categoria=" + categoria + ", email=" + email + "]";
	}

}
