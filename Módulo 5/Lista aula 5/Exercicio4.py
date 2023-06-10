import random
from collections import Counter

random.seed(10)

matriz = []
for _ in range(4):
    linha = []
    for _ in range(4):
        numero = random.randint(1, 50)
        linha.append(numero)
    matriz.append(linha)

aparicoes = Counter([numero for linha in matriz for numero in linha])

print("Quantidade de aparições de cada número:")
for numero, quantidade in aparicoes.items():
    print(f"Número {numero}: {quantidade} aparições")

print("\nNúmeros que aparecem duas vezes:")
for numero, quantidade in aparicoes.items():
    if quantidade == 2:
        print(numero)