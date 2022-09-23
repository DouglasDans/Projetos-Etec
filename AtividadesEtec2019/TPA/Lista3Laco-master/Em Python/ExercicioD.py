# -*- coding: utf-8 -*-
km = input("Digite a distância da estrada em km: ")
km = float(km)
mes = 3.75
while mes <= km:
    d = mes
    mes = mes + 3.75
d = d / 3.75
d = d + 1.0
d = str(d)
print("Vai demorar "+d+" meses para terminar a estrada")