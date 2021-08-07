arquivo = open("arquivo.txt", "r")
#ler o arquivo como uma lista de linhas
lista = arquivo.readlines()

print(lista)

arquivo.close()
