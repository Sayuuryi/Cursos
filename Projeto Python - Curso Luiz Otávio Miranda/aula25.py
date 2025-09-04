"""
Interpolação básica de strings
s - string
d e i - int
f - float
x e X - hexadecimal (ABCDEF0123456789)
"""

nome = 'Sayu'
price = 1000.95897643
variable = '%s, the price is R$%.2f' % (nome, price)
print(variable)
print('O hexadecimal de %d é %08X' % (1612, 1612))