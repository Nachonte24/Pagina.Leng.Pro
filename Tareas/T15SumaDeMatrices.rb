=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end
mensaje =""
puts "BIENVENIDO  "
puts "Vamos a empezar declarando las dimensiones de la PRIMERA matriz "
puts"Introduzca el numero de filas"
n = gets().to_i
puts"Introduzca el numero de columnas"
m = gets().to_i
a = Array.new(n){Array.new(m)}
puts "Ahora rellenaremos la PRIMERA  Matriz"
for i in (0...n)
  for j in (0...m)
    print "Introduzca el numero en A[#{i+1}][#{j+1}]: "
    a[i][j]= gets().to_i
  end
end

puts "Vamos a empezar declarando las dimensiones de la SEGUNDA matriz "
puts"Introduzca el numero de filas"
o = gets().to_i
puts"Introduzca el numero de columnas"
p = gets().to_i
b = Array.new(o){Array.new(p)}
puts "Ahora rellenaremos la SEGUNDA  Matriz"
for i in (0...o)
  for j in (0...m)
    print "Introduzca el numero en A[#{i+1}][#{j+1}]: "
    b[i][j]= gets().to_i
  end
end

if n>o || o>n || m>p || p>m
  puts "NO SE PUEDE SEGUIR CON LA SUMA"
  puts "Las dimensiones de ambas matrices no son iguales"
  puts "intente de nuevo"
  abort()
end

c = Array.new(n){Array.new(m)}

for i in (0...o)
  for j in (0...p)
    c[i][j] = a[i][j] + b[i][j]
  end
end

mensaje ="MATRIZ A \n"
for i in (0...n)
  for j in (0...m)
    mensaje="#{mensaje} #{a[i][j]}, "
  end
  mensaje = "#{mensaje} \n"
end
mensaje = "#{mensaje} MATRIZ B \n"
for i in (0...o)
  for j in (0...p)
    mensaje="#{mensaje} #{b[i][j]}, "
  end
  mensaje = "#{mensaje} \n"
end

mensaje = "#{mensaje} MATRIZ RESULTADO \n"
for i in (0...o)
  for j in (0...p)
    mensaje="#{mensaje} #{c[i][j]}, "
  end
  mensaje = "#{mensaje} \n"
end

puts mensaje
