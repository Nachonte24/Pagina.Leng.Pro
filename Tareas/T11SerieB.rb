=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end
mensaje = ""
puts 'BIENVENIDO A LA SERIE B'
puts 'Ingrese hasta que posicion desea llegar en la serie:'
n = gets().to_i 
n=n+1
i=1
for i in (1...n)
  if i.modulo(2)==0
    num=(i/2)+1
    j=1
    for j in (1..num)
      mensaje="#{mensaje} #{i}, "
    end
  else
    mensaje = "#{mensaje} -#{i}, "
  end
end

puts mensaje