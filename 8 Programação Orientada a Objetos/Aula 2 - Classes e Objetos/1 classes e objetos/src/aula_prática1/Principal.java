
 package aula_prática1;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Alo mamae!");
		
		Aluno a = new Aluno();
		a.matricula=1001;
		a.nome="Super Mario";
		a.cpf="112233";
		
		System.out.printf("A matricula do aluno é: %d. O Nome é %s e o cpf é %s", a.matricula, a.nome, a.cpf);
	}
}