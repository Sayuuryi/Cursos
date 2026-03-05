# Operadores in e not in
# Strings são iteráveis
#  0 1 2 3
#  S a y u 
# -4-3-2-1

# nome = 'Sayu'
# print(nome[3])
# print(nome[-2])
# print('Sa' in nome)
# print('sasa' in nome)
# print(10 * '-')
# print('Sa' not in nome)
# print('sasa' not in nome)

nome = input('Digite o seu nome: ')
encontrar = input('Digite o que deseja encontrar: ')

if encontrar in nome:
  print(f'{encontrar} está em {nome}')
else:
  print(f'{encontrar} não está em {nome}')