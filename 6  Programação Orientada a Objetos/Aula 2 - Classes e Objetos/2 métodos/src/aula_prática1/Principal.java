
 package aula_prática1;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Alo mamae!");
		
		Aluno a = new Aluno();
		a.matricula=1001;
		a.nome="Super Mario";
		a.cpf="112233";
		
		Aluno b = new Aluno();
		b.matricula=1002;
		b.nome="Super Yoshi";
		b.cpf="445566";
		
		a.info();
		b.info();
	}
}