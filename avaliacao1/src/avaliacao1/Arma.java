package avaliacao1;

public class Arma {
    
    String nome;
    String atributo;
    String nivel;
    float dano;
    
	public Arma(String nome, String atributo, String nivel, float dano) {
		this.nome = nome;
		this.atributo = atributo;
		this.nivel = nivel;
		this.dano = dano;
	}
	
	public void subirNivel() {
		this.dano = dano + 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public float getDano() {
		return dano;
	}

	public void setDano(float dano) {
		this.dano = dano;
	}

	@Override
	public String toString() {
		return "Arma [nome=" + nome + ", atributo=" + atributo + ", nivel=" + nivel + ", dano=" + dano + "]";
	}
	
}
