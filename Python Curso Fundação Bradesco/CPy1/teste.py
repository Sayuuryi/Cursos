def joao():
    f = int(input('Digite um valor: '))
    return f


def resultado(f1, f2):
    numero = (f1+f2)
    print("Numero 1: ", f1)
    print("Numero 2: ", f2)
    print("Resultado: ", numero, "\nDeu certo?: ", end="")
    if numero >= 2:
        print("Deu sim! :) ")
    else:
        print("Deu ruim :c ")


a = joao()
b = joao()
resultado(a, b)
