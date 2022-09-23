# -*- coding: utf-8 -*-
n = input("Digite o número:")
n = float(n)
div = 0
i = 1
while i <= n:
    if n % i == 0:
        div = div + 1
    i += 1
if div == 2:
    print("Primo")
else:
    print("Não é primo")

