from math import pow
class ModelagemNComplexo:
    
    def __init__(self, real=0, imagin=0):
        self.real = real
        self.imagin = imagin

    def inicializaNumero(self, real, imagin):
        self.real = real
        self.imagin = imagin
    
    def inicializaNReal(self, real):
        self.real = real
        self.imagin = 0

    def inicializaNNulo(self):
        self.real = 0
        self.imagin = 0

    def imprimeNumero(self):
        print(f"\n{self.real} + {self.imagin}i")

    def elgual(self, real, imagin):
        if(self.real == real and self.imagin == imagin):
            return True
        else:
            return False

    def soma(self, numero):
        self.real += numero.real
        self.imagin += numero.imagin
    
    def subtrai(self, numero):
        self.real -= numero.real
        self.imagin -= numero.imagin
    
    def multiplica(self, numero):
        real = (self.real*numero.real) - (self.imagin*numero.imagin)
        imagin = (self.real*numero.imagin) + (self.imagin*numero.real)
        self.real = real
        self.imagin = imagin

    def divide(self, numero):
        real = ((self.real*numero.real) + (self.imagin*numero.imagin))/(pow(numero.real, 2) + pow(numero.imagin, 2))
        imagin = ((self.imagin*numero.real) - (self.real*numero.imagin))/(pow(numero.real, 2) + pow(numero.imagin,2))
        self.real = real
        self.imagin = imagin