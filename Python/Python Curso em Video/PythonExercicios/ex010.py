# Pedir valores em dolar
valor = float(input('Quantos reais você tem? R$'))
dolar = valor / 4.86
euro = valor / 5.27
print('Com R$ {:.2f}, você consegue comprar ${:.2f} dólares e {:.2f}€ euros.'.format(valor, dolar, euro))
