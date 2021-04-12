package praticando_heranca;

public class TestandoHeranca {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("litio");
		p2.setNome("rene");
		p3.setNome("antony");
		p4.setNome("julio");
		
		p2.setCurso("satanismo");
		p3.setEspecialidade("informatica");
		p3.setSalario(3500.54f);
		
	
		System.out.println("o salario do professor: " + p3.getNome() + " é: " + p3.getSalario());
		
		p3.receberAumento(600.56f);
		
		System.out.println("o salario do professor: " + p3.getNome() + " é: " + p3.getSalario());
		

	}
}
