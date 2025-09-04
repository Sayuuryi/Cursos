z = 'Z'
x = 'C'
c = 5.2
string = 'A = {nome}, B = {xicara}, C = {carro:.2f} '
formato = string.format(
  nome=z,xicara=x, carro=c
)

print(formato)