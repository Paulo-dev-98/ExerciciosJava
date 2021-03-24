package exercicio_banco;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(int numConta, String tipo, String dono) {
	   this.setNumConta(numConta);
	   this.setTipo(tipo);
	   this.setDono(dono);
	
	}
	
	public void fecharConta(int numConta, String dono) {
		
		this.setNumConta(numConta);
		this.setDono(dono);
		
	}
	
	public void depositar(int setSaldo) {
		 this.depositar(setSaldo);
	}
	
	public void sacar() {
		
		
	}
	
	public void mensalidade() {
		
	}
	
	
	

}
