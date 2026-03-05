# if / elif      / else
# se / se não se / se não

abrir = input('Você quer "abrir" ou "fechar" o jogo? ')
if abrir == 'abrir':
    print('Você apertou em abrir, o jogo será aberto em alguns segundos.')
elif abrir == 'fechar':
    print('Você apertou em fechar, o seu jogo será fechado em alguns segundos.')
else:
    print('Você escolheu uma opção inválida.')

print('Código encerrado pois todas as ações foram finalizadas.')