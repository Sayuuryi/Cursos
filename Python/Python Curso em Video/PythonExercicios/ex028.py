from random import randint
from time import sleep
computador = randint(1, 5) #Faz o computador randomizar um numero entre 1 a 5
print('\033[33m-=-\033[m' * 20)
print('\033[34mVou pensar em um número entre 0 e 5. Tente advinhar...\033[m')
print('\033[33m-=-\033[m' * 20)
jogador = int(input('\033[37mEm que número eu pensei? \033[m')) #Jogador tenta advinhar
print('\033[35mPROCESSANDO...\033[m')
sleep(3)
if jogador == computador:
    print('\033[32mPARABÉNS! Você conseguiu me vencer!\033[m')
else:
    print('\033[31mGANHEI! Eu pensei no número {} e não no {}!\033[m'.format(computador, jogador))
