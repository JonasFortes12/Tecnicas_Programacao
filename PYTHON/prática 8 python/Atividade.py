from math import factorial
print("________Calcular o Fatorial_________")
n = int(input("Digite um numero: "))

arquivo = open("Resultados.txt", "a")
arquivo.write(f"\nO fatorial de {n} eh {factorial(n)}")

arquivo.close()