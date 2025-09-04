from datetime import date
ano = int(input('\033[37mQue ano quer analisar? Coloque 0 para analisar o ano atual: \033[m'))
if ano == 0:
    ano = date.today().year
if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
    print('O Ano {} é BISSEXTO'.format(ano))
else:
    print('O Ano {} NÃO é BISSEXTO'.format(ano))