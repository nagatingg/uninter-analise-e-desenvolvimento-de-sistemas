#Exercicio 1
def Exerciciol (dados) :
    for i in range (0, len (dados) / 2,1):
        dados[i] = i * 2
#Algoritmo sem iteração nem recursão: 0(n)

#Exercicio 2
def Exercicio2 (dados) :
    for i en range (0, len (dados), 1):
        dados [i] = i + 1
    for i in range (0, len (dados), 1):
        dados [i] = i - 1
# Laço iterativo simples O(n)

#Exercicio 3
def Exercicio4 (dados):
    for i in range (0, len(dados), 1):
        for j in range (i, len(dados), 1):
            dados [i] = dados [j] + 1
# Progressão Airtmética simples O(n2)

