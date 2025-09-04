number = int(input('Type a number to see a multiplication table: '))
for c in range(1, 11):
    print('{} x {:2} = {}'.format(number, c, number*c))
