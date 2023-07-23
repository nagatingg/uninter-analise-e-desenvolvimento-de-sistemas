
 package aula_prática1;


public class Principal {
	public static void main(String[] args) {
		Turma nova = new Turma();
		nova.prof = new Professor();
		nova.prof.nome="Leonardo";
		nova.alunos= new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome="Super Mario";
	}
}