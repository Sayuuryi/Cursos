altura = float(input('Quantos metros de altura tem a parede: '))
largura = float(input('Quantos metros de largura tem a parede: '))
area = altura * largura
tinta = area / 2

print('Para pintar uma área de {}m², você vai precisar de {} litros de tinta para pintar a parede inteira. '.format(area, tinta))