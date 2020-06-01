=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end

puts 'BIENVENIDO A LA CONVERSION DE MONEDAS'
puts 'En este programa se convertira de pesos a la moneda que desee'
puts "Ingrese la cantidad de pesos a convertir: "
pesos = gets().to_i 
puts 'MENU:'
puts '1.Dolar'
puts '2.Euro'
puts '3.Yen'
puts '4.Dolar de Hong Kong'
print "Ingrese la opción deseada:"
opcion = gets().to_i
case opcion
when 1
  conversion=(pesos)/22.0
	mensaje=" dolares"
when 2
  conversion=pesos/24.79;
  mensaje=" euros"; 
when 3
  conversion=pesos/0.21;
  mensaje=" yenes";
when 4
  conversion=pesos/2.93;
	mensaje=" dolares de hong kong";
end

puts("#{pesos} pesos es igual a #{conversion} #{mensaje}")
