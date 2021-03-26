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

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "cc") {
			this.setSaldo(50);
		} else if (tipo == "cp") {
			this.setSaldo(150);
		}
		System.out.println("Conta criada com sucesso");

	}

	public void fecharConta() {

		if (this.getSaldo() > 0) {
			System.out.println("conta ainda possui saldo");
		} else if (this.getSaldo() < 0) {
			System.out.println("conta em debito");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}

	}

	public void depositar(float valor) {
		if (this.getStatus() == true) {
			setSaldo(getSaldo() + valor);
		} else {
			System.out.println("impossivel depositar");
		}
	}

	public void sacar(float valor) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= valor) {
				setSaldo(getSaldo() - valor);
			} else {
				System.out.println("saldo insuficiente");
			}
		} else {
			System.out.println("impossivel sacar");
		}

	}

	public void mensalidade() {
		float valor = 0;
		if (tipo == "cc") {
			valor = 12;
		} else if (tipo == "cp") {
			valor = 20;
		}

		if (this.getStatus() == true) {
			if (this.getSaldo() > valor) {
				setSaldo(getSaldo() - valor);
			} else {
				System.out.println("saldo insuficiente");
			}
		} else {
			System.out.println("impossivel pagar");
		}

	}

}
