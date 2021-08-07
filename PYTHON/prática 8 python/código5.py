arquivo = open("arquivo.txt", "r")

# Ler uma linha de cada vez
primeiraLinha = arquivo.readline()
segundaLinha = arquivo.readline()
terceiraLinha = arquivo.readline()
quartaLinha = arquivo.readline()
quintaLinha = arquivo.readline()

print(f"{primeiraLinha} {segundaLinha} {terceiraLinha} {quartaLinha} {quintaLinha}")