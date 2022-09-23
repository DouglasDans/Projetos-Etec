# -*- coding: utf-8 -*-
i = 0
r = input("Digite a base: ")
r = int(r)
k = int(r)
h = input("Ele será elevado a qual número?")
h = int(h)
while i < h - 1:
    r = k * r
    i += 1
r = str(r)
print("Resultado = "+r)