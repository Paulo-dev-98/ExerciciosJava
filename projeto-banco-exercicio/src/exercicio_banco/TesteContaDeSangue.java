package exercicio_banco;

public class TesteContaDeSangue {

	public static void main(String[] args) {
		
		BancoDeSangue contaAugusto = new BancoDeSangue();
		contaAugusto.Cadastro("Augusto", "565.582.654.58");
		contaAugusto.doar("AA", "nenhum");
		contaAugusto.estadoAtual();
		
		BancoDeSangue contaZick = new BancoDeSangue();
		contaZick.doar("B", "nenhum");
		contaZick.estadoAtual();

	}

}
