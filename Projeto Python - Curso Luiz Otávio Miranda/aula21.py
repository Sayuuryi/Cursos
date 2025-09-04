# Operadores lógicos
# and (e) or (ou) not (não)
# and - Todas as condições precisam ser 
# verdadeiras.
# Se qualquer valor for considerado falso,
# a expressão inteira será avaliada naquele valor
# São considerados falsy
# 0 0.0 '' False
# Também existe o tipo None que é 
# usado para representar um não valor

entrance = input('[O]pen [E]xit: ')
allowed_password = '1234'

if entrance == 'O':
  typed_password = input('Senha: ')
  if entrance == 'O' and typed_password == allowed_password:
    print('Parabêns você entrou no sistema.')
  elif entrance == 'O' and typed_password != allowed_password:
    print('A senha digitada está incorreta.')
if entrance == 'E':
  print('Você escolheu sair do sistema.')

# Avaliação de curto circuito
print(True and True and False)
print(bool(0.0))