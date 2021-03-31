package exercicio_banco;

public class BancoDeSangue {
	
	private String nome;
	private String cpf;
	private String tipoDeSangue;
	private boolean status;
	private String problemaDeSaude;
	
	public void estadoAtual() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("O nome do doador �: " + getNome());
		System.out.println("O CPF do doador �: " +getCpf());
		System.out.println("O tipo sanguinio do doador �:" + getTipoDeSangue());
		System.out.println("O Status do cadastro �: " + getStatus() );
		System.out.println("O problema de saude do doador �: " + getProblemaDeSaude());
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
	public String getTipoDeSangue() {
		return tipoDeSangue;
	}
	public void setTipoDeSangue(String tipoDeSangue) {
		this.tipoDeSangue = tipoDeSangue;
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
	
	public void Cadastro(String nome, String cpd) {
		this.setStatus(true);
		this.setNome(nome);
		this.setCpf(cpd);
		
	}
	
	public void doar(String tipoDeSangue, String problemaDeSaude) {
		this.setTipoDeSangue(tipoDeSangue);
		this.setProblemaDeSaude(problemaDeSaude);
		if(this.getStatus() == true) {
			if(this.getProblemaDeSaude() == "diabetes") {
				System.out.println("voc� n�o pode realizar a doa��o pois voc� tem: " + getProblemaDeSaude());
			} else if(this.getProblemaDeSaude() == "hiperten��o") {
				System.out.println("voc� n�o pode fazer a doa��o pois voc� tem: " + getProblemaDeSaude());
			}else {
				System.out.println("Doa��o autorizada, obrigado!");
			}
		}else {
			System.out.println("voc� n�o pode doar por que n�o � cadastrado");
		}
		
	}
	
	
	

}
