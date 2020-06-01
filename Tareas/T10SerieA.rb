=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end
j=0
mensaje = ""
puts 'BIENVENIDO A LA SERIE A'
puts 'Ingrese hasta que posicion desea llegar en la serie:'
n = gets().to_i 
n=n+1
i=1
for i in (1...n)
  j = (2*i)-1
  num = i ** j
  mensaje ="#{mensaje} #{num}, "
end
puts mensaje