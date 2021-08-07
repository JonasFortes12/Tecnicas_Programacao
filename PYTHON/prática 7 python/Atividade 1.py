from math import factorial
from math import log2
from math import pow


n = int(input("Digite um numero: "))

print("O fatorial de {} é {}".format(n, factorial(n)))
print("O logaritmo de {} na base 2 é {}". format(n, log2(n)))
print("{} elevado a 2 é {}".format(n, pow(n,2)))

