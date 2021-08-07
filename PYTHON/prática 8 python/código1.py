#Cria um arquivo txt para escrita e leitura (w+) 

nomeArquivo = input("Nome do arquivo a ser criado:")

arquivo = open(nomeArquivo, 'w+')

# define 'texto' como uma lista de linhas do arquivo. Usa append para adicionar texto nas linhas
texto = arquivo.readlines()
texto.append(input("Insira o texto: "))

arquivo = open(nomeArquivo, 'w')
arquivo.writelines(texto)

arquivo.close()
