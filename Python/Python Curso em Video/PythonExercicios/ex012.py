preco = float(input('Digite o preço do produto: R$'))
desconto = preco * 0.05
preco_com_desconto = preco * 0.95

print('O Preço do produto é: R${:.2f} e com os 5% de desconto da liquidação fica: R${:.2f} '.format(
    preco, preco_com_desconto))
