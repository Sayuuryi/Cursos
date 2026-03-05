from math import hypot
co = float(input('Comprimento do cateto oposto: '))
ca = float(input('Comprimento do cateto adjacenete: '))
print('A hipotenusa vai medir {:.2f}'.format(hypot(co, ca)))
