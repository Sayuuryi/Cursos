altura = float(input('Quantos metros de altura tem a parede: '))
largura = float(input('Quantos metros de largura tem a parede: '))
area = altura * largura
tinta = area / 2

print('Para pintar uma area de {} é necessario {} litros de tinta'.format(area,tinta))