package br.heran�a_2;

public class TesteHeraca2 {
	public static void main(String[] args) {
//     Visitante v1 = new Visitante();
//     v1.setNome("sat�");
//     v1.setIdade(666);
//     v1.setSexo("m");
//     System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("sat�");
		a1.setIdade(666);
		a1.setSexo("M");
		a1.setCurso("capirotagem");
		a1.setMatricula(666);
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("sat�");
		b1.setIdade(666);
		b1.setSexo("M");
		b1.setCurso("capirotagem");
		b1.setBolsa(12);
		b1.setMatricula(666);
		b1.renovarBolsa();
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
     
	}
}
