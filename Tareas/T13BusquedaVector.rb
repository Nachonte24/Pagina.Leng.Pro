=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end
puts "BIENVENIDO BUSQUEDA DE VECTOR "
puts "Introduzca el numero a encontrar: "
bus = gets().to_i
enc = false
numenc=0
a = [1,4,7,9,21,4,0,2,5,2]
i=0
mensaje = ""
while i<10
  if a[i]==bus
    enc=true
    numenc=numenc+1
  end
  i=i+1
end
print "Su vector es: "
for i in (0...10)
  mensaje = "#{mensaje} #{a[i]}, "
end
if enc == true
  puts "#{mensaje} El #{bus} se encontro #{numenc} veces"
else
  puts "#{mensaje} El numero #{bus} no fue encontrado"
end