package br.herança_2;

public class TesteHeraca2 {
	public static void main(String[] args) {
//     Visitante v1 = new Visitante();
//     v1.setNome("satã");
//     v1.setIdade(666);
//     v1.setSexo("m");
//     System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("satã");
		a1.setIdade(666);
		a1.setSexo("M");
		a1.setCurso("capirotagem");
		a1.setMatricula(666);
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("satã");
		b1.setIdade(666);
		b1.setSexo("M");
		b1.setCurso("capirotagem");
		b1.setBolsa(12);
		b1.setMatricula(666);
		b1.renovarBolsa();
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
		Professor p1 = new Professor(2500, "Magia Negra");
		p1.setNome("Rulio");
		p1.setSexo("M");
		p1.setIdade(83);
		System.out.println(p1.toString());
		p1.receberAumento(300);
		System.out.println(p1.toString());
		
		Tecnico t1 = new Tecnico();
		t1.setNome("lutero");
		t1.setIdade(32);
		t1.setSexo("M");
		t1.setRegistroProfissional(13);
		System.out.println(t1.toString());
		
		
		}
}
