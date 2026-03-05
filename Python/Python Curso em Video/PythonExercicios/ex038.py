n1 = int(input('Primeiro número: '))
n2 = int(input('Segundo número: '))
if n1 > n2:
    print('O PRIMEIRO valor é maior')
elif n1 < n2:
    print('O SEGUNDO valor é maior')
elif n1 == n2:
    print('Os dois valores são IGUAIS')
else:
    print('O Valor digitado não é um número inteiro e não pode ser calculado. Por favor insira outro valor.')