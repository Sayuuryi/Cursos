soma = 0
contador = 0
for n in range(1, 501, 2):
    if n % 3 == 0:
        contador += 1
        soma += n
print('A soma dos valores solicitados é {} e a soma deles é {}'
      .format(contador, soma))
