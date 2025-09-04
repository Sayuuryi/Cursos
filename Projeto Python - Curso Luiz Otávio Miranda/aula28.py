nome = input('Digite o seu nome: ') # Pedindo nome do usuário
idade = input('Digite a sua idade: ') # Pedindo Idade do usuário
numeroletras = (len(nome)) # Faz a leitura do número de letras.
if nome and idade != ' ': # Verifica se nome e idade foram digitados.
  print(f'Seu nome é {nome}')
  print(f'Seu nome invertido é {nome[::-1]}')
  if ' ' in nome: # Verifica se o nome contém espaços.
    print('Seu nome contém espaços.')
  else:
    print('Seu nome não contém espaços.')
  print(f'Seu nome tem {numeroletras} letras')
  print(f'A primeira letra do seu nome é {nome[0:1]}')
  print(f'A última letra do seu nome é {nome[::-numeroletras]}')
else:
  print('Desculpe, você deixou campos vazios') # Verifica se o usuário deixou os campos vázios ou não.




# Solução do Professor
# if nome and idade :
#   print(f'Seu nome é {nome})
#   print(f'Seu nome invertido é {nome[::-1]})
#   
#   if ' ' in nome: 
#       print('Seu nome contém espaços')
#   else:
#       print('Seu nome NÃO contém espaços')
#   
#   print(f'Seu nome tem {len(nome)} letras')
#   print(f'A primeira letra do seu nome é {nome[0]})
#   print(f'A última letra do seu nome é {nome[-1]}')
#   print(f'Seu nome é {nome})
#   print(f'Seu nome é {nome})
  # else: