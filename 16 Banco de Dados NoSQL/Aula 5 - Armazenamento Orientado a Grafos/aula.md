# Notas da Aula

**Professor:** Alex Mateus Porn

Tema 1 - Armazenamento Orientado a Grafos
Tema 2 - Banco de Dados orientado a grafos Neo4j
Tema 3 - Gerenciamento do DB com Cypher
Tema 4 - Características de consistência, disponibilidade e escalabilidade
Tema 5 - Casos de uso apropriados

---

Armazenamento Orientado a Grafos
    Apresentada uma estrutura baseada na teoria dos grafos
        Vértices para representar os dados armazenados
        Arestas para representar os relacionamentos entre os dados

Destacam-se em aplicações que precisam traçar os caminhos existentes nos relacionamentos entre os dados:
    Identificar como que um conjunto de amigos está conectado em uma rede
    Descobrir a melhor rota para se chegar a um local em menor tempo

Classificação dos bancos de dados orientados a grafos

Nativos:
    uSAM lISTAS DE ADJACÊNCIAS
        Cada vértice mantém referências diretas para seus vértices adjacentes formando uma espécie de microíndice para os vértices próximos
        A estrutura de grafo é considerada tanto no armazenamento físico quanto no processamento de consultas

Não Nativos:
    Modelam logicamente os dados como grafos
    Armazenam os dados por meio de outros modelos
        Tabelas relacionais
        Estruturas chave-valor
Exemplo:
    No modelo relacional, as relações de triplas vértice-aresta-vértice em um grafo são armazenadas como tuplas em tabelas

Modelagem orientada a grafos

Grafo simples-relacional
    Modelo bem simples e limitado
    Todos os vértices denotam o mesmo tipo de objeto
    Todas as arestas denotam o mesmo tipo de relacionamento

Grafo multirrelacional
    Permite um conjunto variado de tipos de objetos e de relacionamentos
    Possibilita múltiplas relações e um maior poder de modelagem

Grafo de propriedades
    Grafo multirrelacional com atributos e arestas direcinadas
    Uma aresta pode ser direcionada ou rotulada ou valorada com um peso em um modelo
    Valores associados

---

Banco de dados orientado a grafos Neo4j

SGBD distruído orientado a grafos
Possibilita a construção de grafos de propriedades
Implementado em Java, em versões de licenciamento tanto aberta quanto proprietária
Disponibiliza uma versão para gerenciamento do banco de dados local

---

Gerenciamento do Banco de dados Neo4j com Cypher

Linguagem Cypher
    Desenvolvida para uso exclusivo do Neo4j
    Posteriormente adotada por outros bancos de dados de grafo por meio do projeto OpenCypher
    Linguagem oficial de consultas do Neo4j e permite que se crie, modifique e procure dados em uma estrutura baseada em um grafo
    Como o SQL está para o modelo relacional, o Cypher está para os bancos em grafos

---

Características de consistência, disponibilidade e escalabilidade
    Destacam-se a robustex, escalabilidade e o alto desempenho
    Capaz de garantir as propriedades ACID, que são uma das mais importantes características dos bancos de dados relacionais
    Todas as operações que modificam dados ocorrem dentro de uma transação, garantindo que os dados permaneçam em estado consistente
    Permite alta disponibilidade por meio de vários servidores distribuídos

 ---

 Casos de uso apropriados
    Redes Sociais
    Aplicados a situações em que os dados são altamente conectados e devem ser representados a partir da forma como se conectam ou se correlacionam com outros dados
    Recomendações de compras em lojas virtuais
    Sistemas que exploram dados químicos e biológicos para detecção de padrões (Penteado et al., 2014)

