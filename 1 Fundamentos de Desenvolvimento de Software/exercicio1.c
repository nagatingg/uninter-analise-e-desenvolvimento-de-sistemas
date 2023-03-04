
/*
Obter as notas do Aluno
Calcular Média
Verificar se o Aluno foi reprovado ou não

(ALGORITMO em PSEUDOCÓDIGO)

Como a linguagem C é tipada, necessita declarar as variáveis

Se a média >= 7 aprovado
Se não, reprovado

Linguagem C é uma linguagem compilada
Compilando e geranção um executável
*/

int main(void) {
  //declaração de variáveis
  float nota1, nota2, media;

  //obter as notas do usuário
  printf("Digite a sua primeira nota: ");
  scanf("%f", &nota1);

  printf("Digite a segunda nota: ");
  scanf("%f", &nota2);

  //Calcular a média
  media = (nota1 + nota2) / 2;
  
  //Verificiar se o Aluno foi aprovado ou não
  if(media >=7)
    printf("Aprovado");
  else
    printf("Reprovado");
  
  return 0;
}