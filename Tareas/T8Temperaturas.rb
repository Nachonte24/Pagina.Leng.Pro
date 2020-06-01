=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end

puts 'BIENVENIDO A LA CONVERSION DE TEMPERATRURAS'
puts 'Selecione una opcion'
puts '1. De grados Centigrados a Fahrenheit'
puts '2. De grados Fahrenheit a Centigrados'
print "Ingrese la opción deseada "
opcion = gets().to_i
case opcion
when 1
  print 'Ingrese los grados Centigrados'
  C = gets().to_i
  F = (C*1.8)+ 32
  print ("#{C} grados Centigrados es igual a #{F} grados Fahrenheit")
when 2
  print 'Ingrese los grados Fahrenheit'
  F = gets().to_i
  C = (F-32)*(5.0/9.0)
  print("#{F} grados Fahrenheit es igual a #{C} grados Centigrados")
end
