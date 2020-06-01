=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end
enc=false
numenc=0
mensaje =""
puts "BIENVENIDO BUSQUEDA DE MATRIZ "
puts "Vamos a empezar declarando las dimensiones de la matriz "
puts"Introduzca el numero de filas"
n = gets().to_i
puts"Introduzca el numero de columnas"
m = gets().to_i
a = Array.new(n){Array.new(m)}
puts "Ahora rellenaremos la Matriz"
for i in (0...n)
  for j in (0...m)
    print "Introduzca el numero en A[#{i+1}][#{j+1}]: "
    a[i][j]= gets().to_i
  end
end
puts "Ahora buscaremos un numero"
puts "Introduzca el numero que desee encontrar en la matriz: "
bus = gets().to_i
for i in (0...n)
  for j in (0...m)
    if bus == a[i][j]
      enc=true
      numenc=numenc+1
    end
  end
end
puts "Su vector es: "
for i in (0...n)
  for j in (0...m)
    mensaje = "#{mensaje} #{a[i][j]}, "
  end
  mensaje = "#{mensaje} \n"
end
if enc==true
  puts "#{mensaje} El #{bus} se encontro #{numenc} veces"
else
  puts "#{mensaje} El numero #{bus} no se encontro"
end
