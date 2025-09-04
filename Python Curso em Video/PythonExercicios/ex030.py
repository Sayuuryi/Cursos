numero = int(input('\033[35mMe diga um número qualquer: \033[m'))
if numero % 2 == 0:
    print('\033[37mO número {} é \033[36mPAR\033[m'.format(numero))
else:
    print('\033[37mO número {} é \033[36mIMPAR\033[m'.format(numero))
