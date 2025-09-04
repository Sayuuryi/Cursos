velocidade = float(input('\033[37mQual é a velocidade atual do carro? \033[m'))
if velocidade > 80:
    print('\033[31mMULTADO! Você excedeu o limite permitido que é de 80Km/h\033[m')
    multa = (velocidade-80) * 7
    print('\033[31mVocê deve pagar uma multa de \033[33mR${:.2f}!\033[m'.format(multa))
print('\033[32mTenha um bom dia! Dirija com segurança\033[m')