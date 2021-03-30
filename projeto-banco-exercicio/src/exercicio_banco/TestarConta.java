package exercicio_banco;

public class TestarConta {

	public static void main(String[] args) {
		ContaBanco contaJose = new ContaBanco();
		contaJose.abrirConta("cc",999, "José");
	    contaJose.estadoAtual();
	}

}
