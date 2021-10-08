package exercicio_banco;

public class BancoDeSangue {

	private String nome;
	private String cpf;
	private String tipoDeSangueDoDoador;
	private String tipoDeSangueDoReceptor;
	private boolean status;
	private String problemaDeSaude;

	public void estadoAtual() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("O nome do doador �: " + getNome());
		System.out.println("O CPF do doador �: " + getCpf());
		System.out.println("O tipo sanguinio do doador �:" + getTipoDeSangueDoDoador());
		System.out.println("O Status do cadastro �: " + getStatus());
		System.out.println("O problema de saude do doador �: " + getProblemaDeSaude());
	}

	public String getTipoDeSangueDoReceptor() {
		return tipoDeSangueDoReceptor;
	}

	public void setTipoDeSangueDoReceptor(String tipoDeSangueDoReceptor) {
		this.tipoDeSangueDoReceptor = tipoDeSangueDoReceptor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipoDeSangueDoDoador() {
		return tipoDeSangueDoDoador;
	}

	public void setTipoDeSangueDoDoador(String tipoDeSangueDoDoador) {
		this.tipoDeSangueDoDoador = tipoDeSangueDoDoador;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getProblemaDeSaude() {
		return problemaDeSaude;
	}

	public void setProblemaDeSaude(String problemaDeSaude) {
		this.problemaDeSaude = problemaDeSaude;
	}

	public BancoDeSangue() {
		this.setStatus(false);
		this.setProblemaDeSaude("nenhum");

	}

	public void Cadastro(String nome, String cpf) {
		this.setStatus(true);
		this.setNome(nome);
		this.setCpf(cpf);

	}

	public void doar(String tipoDeSangue, String problemaDeSaude) {
		this.setTipoDeSangueDoDoador(tipoDeSangue);
		this.setProblemaDeSaude(problemaDeSaude);
		if (this.getStatus() == true) {
			if (this.getProblemaDeSaude() != "nenhum") {
				System.out.println("voc� n�o pode realizar a doa��o pois voc� tem: " + getProblemaDeSaude());
			} else {
				System.out.println("Doa��o autorizada, obrigado!");
			}
		} else {
			System.out.println("voc� n�o pode doar por que n�o � cadastrado");
		}

	}

	public void receber(String tipoDeSangueDoReceptor, String tipoDeSangueDoDoador) {
		this.setTipoDeSangueDoReceptor(tipoDeSangueDoReceptor);
		this.setTipoDeSangueDoDoador(tipoDeSangueDoDoador);
		if (this.getStatus() == true) {
			if (this.getTipoDeSangueDoReceptor() != this.getTipoDeSangueDoDoador()) {
				System.out.println("doa��o incompativel");
			} else {
				System.out.println("doa��o realizada, obrigado!");
			}

		} else {
			System.out.println("imposivel receber doa��o pois voc� n�o est� cadastrado");
		}
	}

}
