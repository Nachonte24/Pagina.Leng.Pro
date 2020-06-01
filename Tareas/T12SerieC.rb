=begin
Nombre: OSCAR IGNACIO GUAJARDO HERNANDEZ
Matricula:1865021
Hora: V4-6 Martes
=end
puts "BIENVENIDO A LA SERIE C: "
puts "Introduzca hasta que posicion desea: "
posdes = gets().to_i
posicion = 1
nPos = 2
nNeg =-3
positivo = true
k = 0
print "Serie: "
for i in (1..posdes)
  if(positivo==true)then
    for y in (1..posicion)
      if(k>=posdes)then
      abort("")
      else
      print("#{nPos}, ")
      nPos=nPos+2
      k=k+1
      end
    end
    positivo=false
    posicion=posicion+1
  else
    for y in (1..3)
      if(k>=posdes)then
        abort("")
      else
      print("#{nNeg}, ")
      nNeg=nNeg-2
      k=k+1
      end
    end
    positivo=true
  end

end