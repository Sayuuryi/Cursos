# Programa 1

try:
  numero = int(input('Digite um número inteiro: ')) # Pedindo ao usuario um número inteiro
  if numero % 2 == 0:
    print(f'O Número {numero} é PAR')
  else:
    print(f'O Número é IMPAR')
except:
  print('Você não digitou um número inteiro.')

# Programa 2

try:
  hora = int(input('Que horas são: ')) # Pergunta que horas são
  if hora >= 0 and hora <= 11: # Verifica se é o horário é 00:00 - 11:00
    print(f'Bom dia')
  elif hora >= 12 and hora <= 17: # Verifica se é o horário é 12:00 - 17:00
    print(f'Boa tarde')
  elif hora >= 18 and hora <= 23:
    print(f'Boa noite')
  else:
    print('Não conheço esse hora')
except:
  print('Por favor, digite apenas números inteiros.')

# Programa 3

nome = input('Digite o seu nome: ')
tamanho_nome = len(nome)


if tamanho_nome >= 1:
  if tamanho_nome <= 4:  # Verifica se a quantidade de letras é menor ou igual a 4
    print('Seu nome é curto')
  elif tamanho_nome <= 6:  # Verifica se a quantidade de letras é menor ou igual a 6
    print('Seu nome é normal')
  else:  # Verifica se a quantidade de letras é maior que 6
    print('Seu nome é muito grande') 
else:
  print('Digite mais de uma letra.')