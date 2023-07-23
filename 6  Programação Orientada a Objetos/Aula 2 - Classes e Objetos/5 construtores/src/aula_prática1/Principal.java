package aula_prática1;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Turma nova = new Turma();
		nova.prof = new Professor();
		nova.prof.nome="Leonardo";
		nova.alunos= new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome="Super Mario";
		
		Aluno c = new Aluno(1002, "Super Luigi", "222.333.444-5");
		
		ArrayList<Aluno> alunos = new ArrayList();
		
		alunos.add(c);
	}
}