def crip(numero):
    l = list(str(numero))
    for i in range(0, len(l), 1):
        l[i] = int(l[i])
    for i in range(0, len(l), 1):
        l[i] += 6 
    for i in range(0, len(l), 1):
        l[i] = l[i]%10 

    aux = l[0]
    l[0] = l[2]
    l[2] = aux
    aux = l[1]
    l[1] = l[3]
    l[3] = aux

    print(int(f"{l[0]}{l[1]}{l[2]}{l[3]}"))

def descrip(numero):
    l = list(str(numero))
    for i in range(0, len(l), 1):
        l[i] = int(l[i])

    aux = l[0]
    l[0] = l[2]
    l[2] = aux
    aux = l[1]
    l[1] = l[3]
    l[3] = aux

    for i in range(0, len(l), 1):
        if(l[i] not in range(6,10)):
            if l[i] == 0: l[i] = 10
            elif l[i] == 1: l[i] = 11
            elif l[i] == 2: l[i] = 12
            elif l[i] == 3: l[i] = 13
            elif l[i] == 4: l[i] = 14
            elif l[i] == 5: l[i] = 15
    
    for i in range(0, len(l), 1):
        l[i] -= 6
    
    print(int(f"{l[0]}{l[1]}{l[2]}{l[3]}"))


numero = int(input("Digite o numero de 4 digitos: "))
o = int(input("Digite [1]-Encriptografar  [2]-Descriptografar: "))

if(o == 1 and len(str(numero)) == 4 ):
    crip(numero)
elif(o == 2 and len(str(numero)) == 4):
    descrip(numero)
else:
    print("Opcao Invalida ou Numero Invalido .")