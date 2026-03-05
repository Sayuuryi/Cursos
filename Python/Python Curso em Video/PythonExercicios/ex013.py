salario = float(input('Digite o salário do funcionario: R$'))
novo = salario + ( salario * 15 / 100)

print('O Salário do funcionário era de R${:.2f}, e com o aumento de 15% ficou: R${:.2f}'.format(salario, novo))
