aluno = {}

nome = input("Digite o nome do aluno: ")
media = int(input("Digite a média do aluno: "))

aluno['Nome'] = nome
aluno['Média'] = media

if media >= 60:
    aluno['Situação'] = 'AP'
else:
    aluno['Situação'] = 'RP'

print("Dados do aluno:")
for chave, valor in aluno.items():
    print(f"{chave}: {valor}")
