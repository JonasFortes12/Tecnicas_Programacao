from heranca import Pessoa
from heranca import Pais

pessoa1 = Pessoa("Maria", 0)
pessoa2 = Pessoa("João", 1)

pai1 = Pais("Otávio", 1, "Pedrinho")
pai2 = Pais("Olívia", 0, "Joaquina")

print("Pessoa 1: {}".format(pessoa1.nome))
print("Pessoa 2: {}".format(pessoa2.nome))
print("Filho(a) do(a) {} é {}".format(pai1.nome, pai1.getCrianca()))
print("Filho(a) do(a) {} é {}".format(pai2.nome, pai2.getCrianca()))