"""
Iterável -> str, range, etc
Iterador -> quem sabe entregar um valor por vez

next -> me entregue o próximo valor
Exemplo de next: print(next(texto)) # __next__()

iter -> me entregue seu iterador
Exemplo de Iter: texto = iter('Sayu')  # __iter__()
"""

# for letra in texto
texto = 'Sayu' # Iteravel
# iterador = iter(texto) #  Iterator

# while True:
#   try:
#     letra = next(iterador)
#     print(letra)
#   except StopIteration:
#     break

for letra in texto:
  print(letra)