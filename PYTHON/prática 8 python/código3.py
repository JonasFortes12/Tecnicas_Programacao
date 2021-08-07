arquivo = open("arquivo.txt", "r")

#ler o arquivo inteiro em uma única String
unicaString = arquivo.read()

print(unicaString)

arquivo.close()