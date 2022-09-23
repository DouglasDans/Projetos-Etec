# -*- coding: utf-8 -*-
i = 1
h = 0
t = 1
h = int(input("Digite um nuúmero para ser fatorado: "))
while i <= h:
    t = t * i
    i += 1
t = str(t)
print(t)