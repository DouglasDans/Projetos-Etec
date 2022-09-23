# -*- coding: utf-8 -*-
i = 0
p = 1.45
j = 1.34
while i < 24:
	p = p + 0.02
	j = j + 0.025
	i += 1
	pdr = str(round(p,2))
	jao = str(round(j,2))
	cont = str(i)
	print("Pedro = "+pdr+"	João = "+jao+"	Foram "+cont+" Anos")

