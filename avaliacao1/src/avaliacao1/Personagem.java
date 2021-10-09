package avaliacao1;

public class Personagem {
	private String nome;
	private String classe;
	private String atributo;
	private String poder;
    
	public Personagem(String nome, String classe, String atributo, String poder) {
		this.nome = nome;
		this.classe = classe;
		this.atributo = atributo;
		this.poder = poder;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", classe=" + classe + ", atributo=" + atributo + ", poder=" + poder + "]";
	}
    
}
