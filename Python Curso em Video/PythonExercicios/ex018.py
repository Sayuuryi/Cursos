from math import sin, cos, tan, radians
angulo = float(input('Digite o ângulo que você deseja. '))

seno = sin(radians(angulo))
cosseno = cos(radians(angulo))
tangente = tan(radians(angulo))

print('O ângulo de {}º tem o seno de {:.2f}'.format(angulo, seno))
print('O ângulo de {}º tem o cosseno de {:.2f}'.format(angulo, cosseno))
print('ângulo de {}º tem o tangente de {:.2f}'.format(angulo, tangente))
