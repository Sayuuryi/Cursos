print('-' * 77)
print('- Bem vindo ao Jogo da Palavra Secreta.                                     -\n'
'- O Jogo funciona da seguinte forma:                                        -\n'
'- Pensarei em uma Palavra e você digitará apenas um digito                  -\n'
'- Após o você digitar uma letra, e será verificado se está correta ou não   -\n'
'- Caso a letra digitada esteja correta, irá ser exibido a letra, caso       -\n'
'- esteja incorreta seja exibido *                                           -')
print('-' * 77)
print('')

palavra_secreta = 'Sayuuryi'  # Palavra Secreta
letras_acertadas = ''

while True:
  letra_digitada = input('Digite uma letra: ')  # Pedindo letra ao usuário

  if len(letra_digitada) > 1: # Verificando se o usuário digitou mais de uma letra.
    print('Digite apenas uma letra.')
    continue

  if letra_digitada in palavra_secreta:
    letras_acertadas += letra_digitada
  
  palavra_formada = ''
  for letra_secreta in palavra_secreta:
    if letra_secreta in letras_acertadas:
      palavra_formada += letra_secreta
      print(letra_secreta)
    else:
      print('*')