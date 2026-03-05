t1 = int(input('Primeiro termo: '))
razao = int(input('Razão: '))
decimo = t1 + (10 - 1) * razao
for c in range(t1, decimo + razao, razao):
    print('{} '.format(c), end='➔  ')
print('Acabou!')
