from modelagemNComplexo import ModelagemNComplexo

n1 = ModelagemNComplexo()
n2 = ModelagemNComplexo()


# _______________________SOMA___________________________
n1.inicializaNumero(1, 2)
n2.inicializaNumero(3, 4)

n1.soma(n2)
n1.imprimeNumero()

# _______________________SUBTRACAO___________________________
n1.inicializaNNulo()
n2.inicializaNReal(6)

n1.subtrai(n2)
n1.imprimeNumero()

# _______________________MULTIPLICAÇÂO___________________________
n1.inicializaNumero(8, 8)
n2.inicializaNumero(8, 8)

n1.multiplica(n2)
n1.imprimeNumero()

# _______________________IGUALDADE___________________________
print(n1.elgual(8,-8))


# _______________________DIVISÂO___________________________
n1.inicializaNumero(4, 2)
n2.inicializaNumero(2, 4)

n1.divide(n2)
n1.imprimeNumero()

