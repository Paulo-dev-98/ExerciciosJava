package praticando_heranca;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String Curso;
	
	public void cancelarMatricula(int matricula) {
		this.setMatricula(matricula);
		System.out.println("a matricula foi cancelada");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	
	
}
