# User input.
from time import sleep

while True:
  numero_1 = input('Digite um número: ')
  numero_2 = input('Digite outro número: ')
  operador = input('Digite o operador (+-/*)')

  numeros_validos = None
  num_1_float = 0
  num_2_float = 0

    # Converte os números digitados pelo usuário para números float
  try:
    num_1_float = float(numero_1)
    num_2_float = float(numero_2)
    numeros_validos = True
  except:
    numero_validos = None
  
  # Verifica se os números digitados pelo usuário são validos.
    if numeros_validos is None:
      print('Um ou ambos os números digitados são inválidos.')
    continue

  # Verifica se o Operador Digitado é permitido.
  Operadores_Permitidos = '+-*/'

  if operador not in Operadores_Permitidos:
    print('Você não digitou um operador válido.')
  
  # Verifica quantos operadores foram digitados pelo usuário
  if len(operador) > 1:
    print('Digite apenas um operador.')
    continue

  print('Calculando o resultado..')
  print('Por favor, Aguarde enquanto calculamos o resultado da sua conta.')
  print('Calculando...')
  sleep(3)
  print('Confira o resultado abaixo:')

  if operador == '+':   # Calculo de Soma
    print(f'{num_1_float} + {num_2_float} =', (num_1_float + num_2_float))
  elif operador == '-':   # Calculo de Subtração
    print(f'{num_1_float} - {num_2_float} =', (num_1_float - num_2_float))
  elif operador == '*':   # Calculo de Multiplicação
    print(f'{num_1_float} * {num_2_float} =', (num_1_float * num_2_float))
  elif operador == '/':   # Calculo de Divisão
    print(f'{num_1_float} / {num_2_float} =', (num_1_float / num_2_float))
  else:
    print('Isso aqui nunca deveria ser exibido.')

  # Pergunta se quer encerrar a calculadora.
  sair = input('Deseja sair da calculadora? ').lower().endswith('s')
  
  if sair is True:
    break
