nomeCompleto = input("Digite seu nome completo: ")

nomeMaiusculo = nomeCompleto.upper()

nomeMinusculo = nomeCompleto.lower()

quantidadeLetras = len(nomeCompleto)

nomes = nomeCompleto.split()
nomes[-1] = "do Inatel"
nomeInatel = ' '.join(nomes)

print("Nome com todas as letras maiúsculas:", nomeMaiusculo)
print("Nome com todas as letras minúsculas:", nomeMinusculo)
print("Quantidade total de letras no nome:", quantidadeLetras)
print("Nome com o último sobrenome substituído por 'do Inatel':", nomeInatel)

