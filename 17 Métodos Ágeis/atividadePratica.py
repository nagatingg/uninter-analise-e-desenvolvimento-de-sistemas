# Nome: Wesley Alexandre Rodrigues Martins RU: 4362522

# Criando a Classe Produto
class Produto:
    def __init__(self, codigo_produto, marca, quantidade, valor_unitario):
        # Dados do produto com suas características: 
        # codigo_produto (int)
        # marca (str)
        # quantidade (int)
        # valor_unitario (float)
        self.codigo_produto = codigo_produto
        self.marca = marca
        self.quantidade = quantidade
        self.valor_unitario = valor_unitario

    def atualiza_quantidade(self, quantidade):
        # Atualiza a quantidade do produto no estoque.
        self.quantidade += quantidade

    def valor_total(self):
        # Calcula o valor total.
        return self.quantidade * self.valor_unitario

    def __str__(self):
        # Retornando a string do objeto produto.
        return f"Produto(codigo_produto={self.codigo_produto}, marca={self.marca}, quantidade={self.quantidade}, valor_unitario={self.valor_unitario})"

# Criando Classe Cliente
class Cliente:
    def __init__(self, nome_cliente, cpf, telefone, email, endereco):
        # Dados do Cliente com suas características
        # nome_cliente (str)
        # cpf (int)
        # telefone (int)
        # email (str)
        # endereco (str)
        self.nome_cliente = nome_cliente
        self.cpf = cpf
        self.telefone = telefone
        self.email = email
        self.endereco = endereco
        self.historico_compras = []
        self.historico_devolucoes = [] 

    def adicionar_compra(self, compra):
        self.historico_compras.append(compra)
    
    def adicionar_devolucao(self, devolucao):
        self.historico_devolucoes.append(devolucao)

    def __str__(self):
        return f"Cliente(nome_cliente={self.nome_cliente}, cpf={self.cpf}, telefone={self.telefone}, email={self.email}, endereco={self.endereco})"

# Criando exemplos para testes de venda
if __name__ == "__main__":
    produto1 = Produto(1, "Roda Aro 18", 4, 100.0)
    print("Produto 1:", produto1)
    # Vendendo 4 rodas, quando o total em estoque era 4 disponíveis
    produto1.atualiza_quantidade(-4)
    print("Quantidade atualizada:", produto1.quantidade)
    print("Valor total do estoque:", produto1.valor_total())

    # Criando exemplo para a classe Cliente
    cliente1 = Cliente("Wesley Alexandre", 9999999, 9999999, "wesley@gmail.com", "Sorocaba")
    print("Cliente 1:", cliente1)
    cliente1.adicionar_compra("Roda Aro 18")
    print("Histórico de compras:", cliente1.historico_compras)
