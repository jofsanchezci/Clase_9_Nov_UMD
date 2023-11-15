#Sumar y comparar
num1=int(input('Ingrese el valor del numero 1: '))
num2=int(input('Ingrese el valor del numero 2: '))
suma= num1+num2

print('El tipo de dato de', num1, 'es: ', type(num1))
print('El tipo de dato de', num2, 'es: ', type(num2))
print('------------------------------------------')
print('El resultado de la suma es: ', suma)
if suma < 0:
	print('La suma es Negativa')
else:
	print('La suma es Positiva')


