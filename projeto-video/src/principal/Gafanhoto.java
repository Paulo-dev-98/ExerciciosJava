package principal;

public class Gafanhoto extends Pessoa {
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.setLogin(login);
	}

	private String login;
	private int totAssistido;
    
	public void viuMaisUm() {
		this.setTotAssistido(getTotAssistido() + 1);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

//	@Override
//	public String toString() {
//		return "Gafanhoto [É = " + super.toString() + 
//				", login = " + login + 
//				", totAssistido = " + totAssistido + "]";
//	} OUTRA FORMA DE CRIAR O CONSTRUTOR CHAMANDO A SUPER CLASSE.
	
	@Override
	public String toString() {
		return "Gafanhoto [nome = " + nome + 
				", idade = " + idade + 
				", sexo = " + sexo + 
				", experiencia = " + experiencia + 
				", login = " + login + 
				", totAssistido = " + totAssistido + "]";
	}
	
}
