# password = '123456'
# typed_password = ''
# repetitions = 0

# while password != typed_password:
#   typed_password = input(f'Your password ({repetitions}x): ')
  
#   repetitions += 1
# print(f'It repeated {repetitions} time(s)')
# print('This while that had just done could have infinite repetitions.')

text = 'Sayuuryi'

new_text = ''
for letter in text:
  new_text += f'*{letter}'
  print(letter)

print(new_text + '*')