# Usa iteração para percorrer todas as linhas do arquivo.

arquivo = open("arquivo.txt", "r")

for linha in arquivo:
    print(linha)

arquivo.close()

