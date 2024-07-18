a# Notas da Aula

**Professor:** Alex Mateus Porn

#### [Tema 1 - Armazenamento Orientado a Colunas](#tema1)
#### [Tema 2 - Banco de Dados Orientado a Colunas HBase](#tema2)
#### [Tema 3 - Operações CRUD no HBase](#tema3)
##### [Tema 4 - Características de Consistência, Disponibilidade e Escalabilidade](#tema4)
#### [Tema 5 - Casos de Uso Apropriados](#tema5)

---

## <a name="tema1">Armazenamento Orientado a Colunas</a>

- Apresenta conceitos muito similares aos bancos de dados relacionais.
- Formado basicamente pela composição de linhas e colunas.
- Pode ser considerado como a mais complexa entre as quatro estruturas NoSQL que estudamos.

Primeiramente, define-se as famílias de colunas e, em seguida, as colunas. Cada família permite a flexibilidade de inserir quantas colunas forem necessárias para cada registro armazenado, sem precisar alterar a estrutura dos dados já armazenados.

### Características

- Fornece flexibilidade e grande escalabilidade.
- O registro de um item pode ter informações gravadas em diversas famílias de colunas.
- As colunas podem estar armazenadas em diferentes servidores, pois os dados são armazenados fisicamente em uma sequência orientada a colunas e não a linhas.

---

## <a name="#tema2">Banco de Dados HBase</a>

- SGBD distribuído orientado a colunas.
- Utilizado principalmente com grande quantidade de dados e muitos atributos.
- Desenvolvido para funcionar sobre o Hadoop:
  - Plataforma para projetos distribuídos.
- Disponibiliza uma versão para gerenciamento do banco de dados local (standalone).

---

## <a name="tema3">Operações CRUD no HBase</a>

### Interface Shell no HBase

```shell
./hbase shell
```

### Criação do banco de dados
    O primeiro passo consiste em criamos uma tabela e a família de colunas desejada
    create 'clientes', 'dados_pessoas', 'endereco'
        clientes = tabelas
        dados_pessoais, endereco = familia de colunas

### Inserindo dados na tabela Clientes
    put 'clientes', '1', 'dados_pessoais:nome', 'Clientes1'

----

## <a name="tema4">Características de Consistência, Transações e Disponibilidade</a>

- Todas as leituras e gravações são roteadas por meio de um único servidor de região.
- Isso garante que todas as gravações ocorram em ordem e todas as leituras acessem os dados conforme foram armazenados recentemente.
- Se o servidor ficar indisponível, as regiões das tabelas hospedadas no servidor de região ficarão indisponíveis por algum tempo, até que sejam recuperadas.

### Características de Consistência

- **Consistência forte:**
  - Os dados mais recentes são sempre veiculados.
  - No entanto, pode aumentar muito a latência no caso de uma falha do servidor de região, porque apenas o servidor de região primário tem garantia de ter os dados mais recentes.

### Escalabilidade

- Possui uma recomendação mínima de 5 nós por cluster Hadoop.
- Permite escalar com facilidade para centenas de nós de acordo com a demanda.

---

## <a name="tema5">Casos de Uso Apropriados</a>

Conforme Shon (2014):

- Análise em lote de dados de logs, devido a sua otimização para leituras e varreduras sequenciais.
- Captura de métricas em tempo real de aplicativos, servidores, preferências do usuário, entre outros.

### Exemplos

- **Facebook:** Gerenciamento de mensagens de usuários.
- **Pinterest:** Fornecer feeds personalizados, capturar dados e potencializar seu processo de recomendações.
- **Explorys:** Capturar bilhões de pontos anônimos de dados clínicos, operacionais e financeiros. A Explorys usa essa plataforma para ajudar seus clientes a obter atendimento de qualidade, minimizar custos e mitigar riscos.







