print(('=' * 11), end='')
print('Loja', end='')
print(('=' * 11))
compras = float(input('Preço das compras: R$'))
print('''
[ 1 ] à vista dinheiro/cheque
[ 2 ] à vista cartão
[ 3 ] 2x no cartão
[ 4 ] 3x ou mais no cartão''')
opção = int(input('Qual é a opção? '))
if opção == 1:
    total = compras - (compras * 10 / 100)
elif opção == 2:
    total = compras - (compras * 5 / 100)
elif opção == 3:
    total = compras
    parcela = total / 2
    print('Sua compra será parcelada em 2x de R${:.2f}'.format(parcela))
elif opção == 4:
    parcela4 = int(input('Quantas vezes vai parcelar? (Podendo ser até em 12x): '))
    total = compras + (compras * 20 / 100)
    parcela = total / parcela4
    print('Sua compra será parcelada em {}x de R${:.2f} COM JUROS'.format(parcela4, parcela))
    if parcela4 > 12:
        print('Você não pode parcelar acima de 12 vezes')
else:
    total = compras
    print('A opção que você digitou é invalida, Por favor tente novamente.')
print('Sua compra de R${:.2f} vai custar R${:.2f} no final.'.format(compras, total))
