somaA = 1 + 2 + 3 + 4 + 5;
mediaB = ((23 + 19 + 31) / 3);
divisaoC = 403 // 73;
sobraD = 403 % 73;
potenciaE = 2 ** 10;
absoluteF = abs(54 - 57);
menorG = min(34, 29, 31);

a = 3
b = 4
c = a * a + b * b

s1 = "ant"
s2 = "bat"
s3 = "cod"

#print(s1 + " " + s2 + " " + s3);

#print(10 * (s1 + " "));

#print(s1 + " " + 2 * (s2 + " ") + 3 * (s3 + " "));

#print(7 * (s1 + " " + s2 + " "));

#print(5 * (s1 + s2 + s3 + " "));

#preco = float(input("Qual o valor do produto? "));

#p = float(input("Qual o valor do desconto? (0-100)%"));

# = preco * (p / 100);

#final = preco - desconto;

#print("O preço final do produto é: {}" .format(final));

#Exercicio 2
#quantidadeKm = float(input("Qual foi a quantidade de km percorridos? "));
#quantidadeDias = int(input("Qual foi a quantidade de dias que o carro foi alugado?"));

#valorKm = quantidadeKm * 60;
#valorDias = quantidadeDias * 0.15;

#print("O carro foi alugado por {} dias, sendo percorrido a distancia de {} km"
#      .format(quantidadeDias, quantidadeKm));
#print("Sendo cobrado o valor de R$ {} pelo kms rodados. Além de R$ {} pela quantidade de dias alugados."
#      " O valor total é R$ {}" .format(valorKm, valorDias, valorDias + valorKm));

#Exercicio 3

fraseQualquer = input("Digite sua frase: ");
tam = len(fraseQualquer) /2;
fraseMetade = fraseQualquer[:int(tam)]

print(fraseMetade[-2:]);  #Começa de trás para frente