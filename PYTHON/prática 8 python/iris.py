from math import factorial

arquivo = open("pratica3.txt","a")
n = int(input("Digite um numero que deseja calcular o fatorial: "))

arquivo.write(f"O resultado do fatorial de {n} eh {factorial(n)}")

arquivo.close()