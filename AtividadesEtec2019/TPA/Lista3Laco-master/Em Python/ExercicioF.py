# -*- coding: utf-8 -*-
k = input("Digite o numero de termos: ")
k = float(k)
ant = 0
p = 1
i = 0
while i < k:
    a = ant + p
    astr = str(a)
    print("Resultado "+astr)
    ant = p
    p = a
    i += 1