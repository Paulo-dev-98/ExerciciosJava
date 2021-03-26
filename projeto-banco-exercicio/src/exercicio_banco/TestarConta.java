package exercicio_banco;

public class TestarConta {

	public static void main(String[] args) {
		ContaBanco contaJose = new ContaBanco();
		contaJose.abrirConta("cc", 666, "José");
	    contaJose.estadoAtual();
	}

}
