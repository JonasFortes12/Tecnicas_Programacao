def convertMetro(metros):
    milimetros = metros*1000
    return milimetros

def convertSegundo(segundos):
    minutos = segundos//60
    horas = minutos//60
    dias = horas//24

    horas = horas - (dias*24)
    minutos = minutos - (horas*60) - (dias*24*60)
    segundos = segundos - ((minutos+horas * 60) + (dias*24*60))*60

    return "{} dia(s), {} horas(s), {} minuto(s) e {} segundo(s)".format(dias, horas, minutos, segundos)


m = float(input("Digite a distância em metros: "))
print("{} milímetros".format(convertMetro(m)))

s = int(input("Digite os segundos: "))
print(convertSegundo(s))