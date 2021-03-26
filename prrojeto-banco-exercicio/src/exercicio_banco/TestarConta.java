package exercicio_banco;

public class TestarConta {

	public static void main(String[] args) {
		ContaBanco contaJose = new ContaBanco();
		contaJose.abrirConta("cc");
		
		System.out.println(contaJose.getSaldo());
		
		contaJose.depositar(100);
		
		System.out.println(contaJose.getSaldo());
		
		contaJose.sacar(120);
		
		System.out.println(contaJose.getSaldo());
		
		contaJose.sacar(50);
		System.out.println(contaJose.getSaldo());
		
		contaJose.mensalidade();
		System.out.println(contaJose.getSaldo());
		
		contaJose.fecharConta();
		System.out.println(contaJose.getStatus());
		
		contaJose.sacar(18);
		
		contaJose.fecharConta();
		System.out.println(contaJose.getStatus());

	}

}
