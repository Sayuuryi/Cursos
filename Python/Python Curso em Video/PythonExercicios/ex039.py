from datetime import date
genero = print('''Digite o numero do seu gênero abaixo.
[ 1 ] Masculino                 
[ 2 ] Feminino''')
opção = int(input('Qual o numero do seu gênero: '))
if opção == 2:
    print('Pessoas do sexo feminino não precisam se alistar obrigatoriamente.')
else:
    nasc= int(input('Ano de nascimento: '))
    atual = date.today().year
    idade = atual - nasc
    print('Quem nasceu em {} tem {} anos em {}'.format(nasc, idade, atual))
    if idade == 18:
        print('Você tem que se alistar IMEDIATAMENTE!')
    elif idade < 18:
        saldo = 18 - idade 
        print('Ainda faltam {} anos para o alistamento.'.format(saldo))
        ano = atual + saldo
        print('Seu alistamento será em {}'.format(ano))
    elif idade > 18:
        saldo = idade - 18
        print('Você já deveria ter se alistado há {} anos.'.format(saldo))
        ano = atual - saldo
        print('Seu alistamento foi em {}.'.format(ano))
