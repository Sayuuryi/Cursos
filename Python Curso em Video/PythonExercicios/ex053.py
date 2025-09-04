frase = str(input('Digite uma frase: ')).strip().upper()
palavras = frase.split()
juntos = ''.join(palavras)
inverso = ''
inverso = juntos[::-1]
print('O inverso de {} é {}'.format(juntos, inverso))
if inverso == juntos:
    print('Temos um palíndromo')
else:
    print('A frase digitada não é um palíndromo')
