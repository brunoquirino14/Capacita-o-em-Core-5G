import random

random.seed(10)

matriz = []
for _ in range(4):
    linha = []
    for _ in range(4):
        numero = random.randint(1, 50)
        linha.append(numero)
    matriz.append(linha)

for linha in matriz:
    print(linha)