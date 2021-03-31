package exercicio_banco;

public class TestarConta {

	public static void main(String[] args) {
		ContaBanco contaJose = new ContaBanco();
		contaJose.abrirConta("cc",999, "José");
	    contaJose.estadoAtual();
	    
	    ContaBanco contaMaria = new ContaBanco();
	    contaMaria.abrirConta("cp", 2428, "Maria");
	    contaMaria.estadoAtual();
	    
	    contaMaria.sacar(135);
	    contaMaria.estadoAtual();
	    
	    contaMaria.depositar(35);
	    contaMaria.sacar(50);
	    
	    contaMaria.fecharConta();
	    contaMaria.estadoAtual();
	}

}
