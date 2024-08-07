Professor: Vinicius Pozzobon Borin

Introdução a ED: algoritmos de busca e Complexidade de Algoritmos

---

Estruturas de dados são maneiras de organizá-las e colecioná-las
A forma como os dados ficam organizados dentro da memória, o acesso a eles e suas manipulações caracterizam a nossa disciplina

---

- Pesquisa em um conjunto de dados
    Exemplo mostrado em vídeo

---

- Análise de algoritmos

Um algoritmo mais eficiente para resolver um problema é um algoritmo de menor complexidadade
A complexidade do algoritmo cresce à medida que o tamanho do conjunto de dados (n) também cresce

Complexidade de tempo:
    A quantidade de tempo que um algoritmo leva para completar a sua execução
        A quantidade de instruções de código impacta diretamente este desempenho
Complexidade de espaço:
    A quantidade de memória requerida para um algoritmo executar
        A quantidade de variáveis e seus tamanhos impactam diretamente este desemepenho

Tempo: 
    Quanto mais dados, mais tempo
    Disposição dos dados dentro do conjunto, também faz diferença

A notação nos dá a tendência de funcionamento de um algoritmo. A ordem de grandeza
Para sabermos a complexidade de um algoritmo utilizando a notação Big-o, basta encontrarmos o termo de maior grau da equação que o descreve

Big-o: pior caso (limite inferior)
Big-Ω: melhor caso (limite superior)
Big-θ: caso médio

---

- Encontrando o Big-O de Algoritmos
Algoritmo sem laço = o(1) constante

Laço simples

Progressão aritmética (PA)
    Sequência de números entre dois termos constantes
Também existindo uma PA constante

Progressão Geométrica (PG)
    Sequencia de nýumeros na qual existe uma razão entre um número e seu sucessor

---

- Dividir para conquistar
    Um problema muito complexo pode ser dividido em partes menores
        Exemplo da folha utilizado na aula

Dividimos um algoritmo recursivamente
    Duas etapas
        1 Descobrir o caso-base, menor parte possível do problema
        2 Descobrir como reduzir o problema para que ele se torne o caso-base

---

- Complexidade da recursividade
    Exemplo de fatorial utilizado na aula

Encontrando o Big-O da recursividade:
    1 Calcular a complexidade de uma única chamada da função
    2 / 3 Número de chamadas recursivas e multiplicar o número de chamadas pela complexidade de uma chamada de recursão
 Fibonacci utilizado

 Aplicação da Equação geral da recursividade

    Uma função que chama ela mesmo = n
    Uma função que chama ela duas vezes 2n
        etc
    
Anotações importantes da aula:
    - Algoritmo sem iteragöes nem recursäo: 0(1)
    - Lago iterativo simples: O(n)
    - Progressäo aritmética (PA): O(n2)
    - Progressäo geométrica (PG): 0(271)
    - Dividir para conquistar: O(logn)
    - Recursäo simples: O(n)
    - Recursäo em årvore binåria: 0(271)
