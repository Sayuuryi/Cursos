for par in range(2, 51, 2):
    if par <= 1:
        par = 1+1
        for par in range(2, 51, 2):
            print('{} '.format(par), end=' ')
print('Acabou!')

# Também poderia ter sido feito do método abaixo
# for par in range(2, 51, 2):
#   print('{} '.format(par), end=' ')
# print('Acabou!')
