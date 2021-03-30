package exercicio_banco;

public class TestarConta {

	public static void main(String[] args) {
		ContaBanco contaJose = new ContaBanco();
		contaJose.abrirConta("cc",888, "José");
	    contaJose.estadoAtual();
	}

}
