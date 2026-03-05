"""
Iterando strings com while
"""
#       012345678
nome = 'Sayu Chan'  # Iteráveis
#       987654321

indice = 0
novo_nome = ''
while indice < len(nome):
  letra = nome[indice]
  novo_nome += f'*{letra}' 
  indice += 1 
 
novo_nome += '*'
print(novo_nome)
# Tentar gerar nova string com while, deve ficar = S*a*y*u *C*h*a*n