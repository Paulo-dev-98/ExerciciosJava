package avaliacao1;

import java.util.Date;

public class CadastroDeUsuario {

	private String nome;
	private int cpf;
	private int rg;
	private Date dataDeNascimento;
	private String estadoCivil;
	private int cep;
	private String pais;
	private String estado;
	private String cidade;
	private String endereco;
	
	
	public CadastroDeUsuario(String nome, int cpf, int rg, Date dataDeNascimento, String estadoCivil, int cep,
			String pais, String estado, String cidade, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataDeNascimento = dataDeNascimento;
		this.estadoCivil = estadoCivil;
		this.cep = cep;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.endereco = endereco;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
