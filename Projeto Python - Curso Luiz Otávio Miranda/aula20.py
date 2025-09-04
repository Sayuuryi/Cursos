valor_1 = input('Digite um número: ')
valor_2 = input('Digite outro número: ')

if valor_1 > valor_2:
    print(
        f'{valor_1=} é maior ' 
        f'do que {valor_2=}'
    )
elif valor_1 < valor_2:
    print(
        f'{valor_2=} é menor ' 
        f'do que {valor_1=}'
    )
elif valor_1 == valor_2:
    print(
        f'{valor_1=} é igual '
        f'ao {valor_2=}'
    )
else:
    print('Os valores que você digitou não são válidos.')
