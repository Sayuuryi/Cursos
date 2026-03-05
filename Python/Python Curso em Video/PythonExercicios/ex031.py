distancia = int(input('\033[37mQual é a distância da sua viagem? \033[m'))
if distancia <=200:
    preço = distancia * 0.50
else:
    preço = distancia * 0.45
print('\033[37mVocê está prestes a começar uma viagem de {:.1f}Km.\033[m'.format(distancia))
print('\033[37mE o preço da sua passagem será de R${:.2f}\033[m'.format(preço))