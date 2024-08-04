Professor: Alex Mateus Porn
Tecnologias NoSQL

- Conversa Inicial
Tema 1 - Migrações de esquema
Tema 2 - Persistência Poliglota
Tema 3 - Além do Nosql
Tema 4 - Bancos de Dados NewSQL
Tema 5 - Escolhendo seu Banco de Dados

---

Migrações de esquema
    Natureza livre de esquemas
    Permite aos desenvolvedores concentrarem-se no projeto do domínio sem preocupação com alterações no esquema
    Possibilitam a mesma proposta dos métodos ágeis, em que é importante atender as mudanças no requisitos
    Ao contrário dos bancos de dados relacionais, a abordagem sem esquema visa a flexibilidade nas alterações
    Tem como objetivo atender as frequentes alterações no mercado e as inovações de produtos de software

Aspectos para se atentar antes de escolher:
    Os tipos de relacionamentos para bancos de dados orientados a grafos
    Os nomes das familias de colunas, linhas e colunas ou a ordem das colunas para os bancos de dados orientado a colunas
    Como as chaves estão atribuidas e qual é a estrutura dos dados dentro do objeto de valores para os bancos de dados orientado a chave-valor

Considerações para a migração de esquemas (Sadalage; Fowler)
    Esquemas fortes podem ser migrados gravando cada alteração do esquema, mais a migração de dados, em uma sequência controlada por versões
    Bancos de dados sem esquema precisam de uma migração cuidadosa devido ao esquema implícito nos códigos que acessam os dados

-----

- Persistência poliglota
    Sadalage e Fowler
    Utilizar um único mecanismo de banco de dados para todas as necessidades resulta em soluções de baixo desempenho
    Armazenar dados transacionais, guardar em cache as informações de sessão, percorrer grafos de clientes e produtos que seus amigos compraram são problemas essecialmente diferentes

Em 2006, Neal Ford propôs a expressão "programação poliglota" para expressar a ideia de que os aplicativos devem ser escritos em uma mistura de linguagens, de modo a aproveitar o fato de que diferentes linguagens são apropriadas para lidar com diferentes problemas

Exemplo - Sistema de comércio eletrônico
    Dados do carrinho de compras antes de o pedido ser confirmado e dados da sessão do usuário:
        Banco de dados orientado a chave-valor
    Confirmação de pagamento e compras realizadas:
        Bancos de dados relacionais
    Recomendação de produtos para clientes:
        Banco de dados orientado a grafos

-----

- Além do NoSQL

Bancos de Dados XML
    Similares aos bancos de dados orientados a documentos
    Os documentos são armazenados em um modelo de dados compatível com XM
    Alguns bancos de dados relacionais permitem inserir documentos XML como um tipo de coluna e possibilitam alguma forma de misturar as linguagens de consulta SQL e XML 

Elasticsearch
    Não é necessariamente um banco de dados, mas uma ferramenta para processamento de queries envolvendo textos
    Utiliza lógica difusa para fazer consultas aos dados. Cada palavra recebe uma nota baseada no termo buscado, assim retornando palavras semelhantes

openCypher
    Cypher é a linguagem padrão para manipulação e gerencimento dos bancos de dados orientados a grafos

Datomic
    Armazena todo o histórico de atualizações dos registros

Spark
    Não é um banco de dados, mas sim um motor para processamento de fluxo
    Permite montar e gerenciar um cluster de máquinas para executar processamentos em cima de grandes volumes de dados

PostgreSQL Document Store
    oFERECE SUPORTE PARA ARMAZENAR DOCUMENTOS json, TANTO NO FORMATO json PURO QUANTO NO FORMATO BINÁRIO (JSONB), semelhante ao formato BSON usado pelo MongoDB
    Permite a realização de consultas por atributos, elementos aninhados e em arrays, da mesma forma como em um banco orientado a documentos

Redis e Memcached
    São bancos Nosql ORIENTADOS A CHAVE-VALOR
    O redis usa uma forma de replicação de dados baseada em master/slave e suporta tipos de dados especiais, como conjuntos (set) e listas (list)
    O memcached segue uma filosofia mais simplista: parte da lógica deve ficar no cliente, pois o servidor não suporte nenhum tipo de replicação ou dados especiais

-----

- Bancos de dados NewSQL

NewSQL
    Surgiram a partir da necessidade de consistência dos dados e de poder escalonar mais facilmente o sistema
    Referem-se a uma classe de sistemas de gerenciamento de bancos de dados relacionais que procuram oferecer o mesmo desempenho escalável do modelo NoSQL

Banco de dados totalmente relacional
Conformidade com as propriedades ACID
Latência de milissegundos
Tolerância a falhas
Execução local ou na nuvem (exclusivo NewSQL)
Processamento de milhões de transações por segundo
Escalonamento vertical
Podem usar diferentes formas de armazenamento

Grolinger
    Adequados para:
        Cenários em que o tradicional banco de dados relacional é utilziado, mas que têm requisitos adicionais de escalabilidade e desempenho
        Aplicativos no mercado financeiro, nos quais operações como transferências de dinheiro precisam atualizar duas contas automaticamente e todos os aplicativos precisam ter a mesma visão do banco de dados

------

- Escolhendo seu banco de dados

Considerações:
    Produtividade do programador
    Desempenho no acesso aos dados

Produtividade do programador
    Examinar o que o software precisará fazer
    Observar os recursos atuais
    Verificar como o uso dos dados é mais apropriados
Situações iniciais do projeto, fazendo alguns testes, para verificar se aquela estrutura é boa ou não, meio que utilizando prototipos

Desempenho no acesso aos dados
    Importantes testar o desemepnho em cenários adequados ás necessidades do desenvolvedor
    A melhor forma de avaliar o desemepenho apropriadamente é criando uma solução para um problema específico, executando e medindo-o
Não é possível testar todas as formas como aplicativo será utilizado
É necessário criar um conjunto representativo de testes, selecionando:
    Cenários que sejam os mais comuns
    Cenários mais dependentes de desempenho
    Cenários que não pareçam se adaptar bem ao modelo de banco de dados proposto

Principais motivos para usar NoSQL
    Melhorar a produtividade do programador, utilizando um banco de dados que se adapte melhor ás necessidades de um aplicativo
    Melhorar o desemepnho no acesso aos dados por meio de alguma combinação na manipulação de volumes maiores de dados, reduzindo a latência e melhorando o rendimento

