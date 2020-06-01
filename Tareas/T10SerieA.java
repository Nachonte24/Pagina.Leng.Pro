/*  NOMBRE : OSCAR IGNACIO GUAJARDO HERNANDEZ
MATRICULA : 1865021  HORA: V4-6;*/

import javax.swing.JOptionPane;

public class T10SerieA
{
	public static void main (String[] arg)
	{
		String mensaje="";
		int n=0, i=0, j=0;
		double num=0;
		String Ventana = JOptionPane.showInputDialog("BIENVENIDO A LA SERIE A\n:"
				+"Ingrese hasta que posicion desea llegar en la serie: ");
	
		n = Integer.parseInt(Ventana);
		for(i=1;i<=n;i++)
		 {    
			j=2*i-1;
			num= Math.pow(i,j);
			mensaje=mensaje+num+", ";
		 }
		 JOptionPane.showMessageDialog(null,mensaje);
		 
	}
}
