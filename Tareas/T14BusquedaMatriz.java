 /*  NOMBRE : OSCAR IGNACIO GUAJARDO HERNANDEZ
MATRICULA : 1865021  HORA: V4-6;*/

import javax.swing.JOptionPane;

public class T14BusquedaMatriz
{
	public static void main (String[] arg)
	{
		String ventana, mensaje="";
		int i, bus, numenc=0, n, m, j;
		//numenc Numero de veces encontrado
		boolean enc=false; //variable para indicar que se encontro
		JOptionPane.showMessageDialog(null, "BIENVENIDO A LA BUSQUEDA DE VECTORES\n"
				+ "Vamos a empezar declarando las dimensiones de la matriz ");
		
		ventana = JOptionPane.showInputDialog("Introduzca el numero de filas");
		n = Integer.parseInt(ventana);
		ventana = JOptionPane.showInputDialog("Introduzca el numero de columnas");
		m = Integer.parseInt(ventana);
		//declaracion del arreglo
		int A[][] = new int [n][m];
		JOptionPane.showMessageDialog(null, "Ahora rellenaremos la Matriz");
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				ventana = JOptionPane.showInputDialog("Introduzca el numero en A["+i+"]["+j+"]: ");
				A[i][j] = Integer.parseInt(ventana);
			}
		}
		
		ventana = JOptionPane.showInputDialog("Ahora buscaremos un numero\n"
				+ "Introduzca el numero que desee encontrar en la matriz: ");
		//Busqueda del numero
		bus = Integer.parseInt(ventana);
		
		i=0;
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				if(bus == A[i][j])
				{
					enc=true;
					numenc++;
				}
			}
		}
		//se enseña el vector
		mensaje="Su vector es: \n";
		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				mensaje = mensaje + A[i][j] + ", ";
			}
			mensaje = mensaje + "\n";
		}
		//Impresion de resultado
		if(enc==true)
		{
			JOptionPane.showMessageDialog(null, mensaje+"\nEl "+bus+" se encontró "+numenc+" veces en la matriz");
		}else {
			JOptionPane.showMessageDialog(null, mensaje+"\nEl numero "+bus+" no fue encontrado");
		}
	}
}