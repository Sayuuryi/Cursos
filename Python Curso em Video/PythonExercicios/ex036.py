valorcasa = float(input('Digite o valor da casa: R$'))
salario = float(input('Digite o salário do comprador da casa: R$'))
anos = int(input('Digite em quantos anos ele vai pagar: '))
prestação = valorcasa / (anos * 12)
mínimo = salario * 30 / 100
print('Para pagar uma casa de R${:.2f} em {} anos'.format(valorcasa, anos), end='')
print(' a prestação será de R${:.2f}'.format(prestação))
if prestação <= mínimo:
    print('Empréstimo pode ser CONCEDIDO!')
else:
    print('Empréstimo NEGADO!')