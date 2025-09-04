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

# Pergunta se o usuário quer [E]ntrar ou [S]air
entrance = input('[E]ntrar [S]air: ')
#Senha Permitida para [E]ntrar
allowed_password = '1234'

if entrance == 'E' or entrance == 'e': # Verifica se o usuário digitou [E]ntrar
  typed_password = input('Senha: ')
  if (entrance == 'E' or entrance == 'e') and typed_password == allowed_password:
  # Verifica se o usuario digitou [E] ou [e] maiusculo ou minusculo e a senha que o usuário digitou está correta e entra no sistema.                                                                                                
    print('Parabêns você entrou no sistema.')
  elif entrance == 'E' and typed_password != allowed_password: # Verifica se a senha digitada e a senha permitida são as mesmas.
    print('A senha digitada está incorreta.')
if entrance == 'S' or entrance == 's': # verifica se digitou sair maiusculo ou minusculo.
  print('Você escolheu sair do sistema.')

# Avaliação de curto circuito

senha = input('Senha: ') or 'Sem senha.' 
print(senha)