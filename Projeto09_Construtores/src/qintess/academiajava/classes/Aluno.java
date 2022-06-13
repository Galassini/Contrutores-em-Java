package qintess.academiajava.classes;

public class Aluno {
	private String nome;
	private int matricula;
	private Curso curso;
	
	
	//Construtores
	
	public Aluno(String nome, int matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
		
	}
	
	
	public Aluno(String nome, int matricula, Curso curso) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}


	public String getNome() {
		return nome;
	
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	/*
	 * Ao criar um objeto da classe Aluno, as informa��es consideradas obrigat�rias s�o; 
	 *  - nome
	 *  - matricula
	 *  
	 *  O curso n�o � obrigat�rio, porque � poss�vel que este aluno ainda n�o tenha escolhido
	 *  o curso que deseja fazer. 
	 */
	
	public String mostrar() { 
		String resposta = "Nome: " + this.getNome() +
		"\nMatr�cula: " + this.getMatricula();
		
		if(this.getCurso() != null) {
			resposta += "\n\nDados do Curso:\n" + this.getCurso().mostrar();
		} else {
			resposta += "\n\nAinda n�o existem Cursos vinculados. ";
		}
		
		return resposta;
		
	}	
}
