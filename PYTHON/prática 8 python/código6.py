#criando novo arquivo. Se o arquivo ja existe, irá sobrescrever
arquivo = open("novoArquivo.txt", "w")

#para escrever no arquivo

arquivo.write('Há mais abaixo do sol do que sua vã filosofia, Orácio.')
arquivo.write('O fantasma do seu pai apareceu-lhe')

arquivo.close()