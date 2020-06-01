/*  NOMBRE : OSCAR IGNACIO GUAJARDO HERNANDEZ
MATRICULA : 1865021  HORA: V4-6;*/

import javax.swing.JOptionPane;

public class T8Temperatura
{
		public static void main (String[] arg)
		{
			String Ventana;
			double C = 0,F = 0;
			String[] options = {"Cancelar", "°C -> °F", "F -> °C"};
			
			int opcion = JOptionPane.showOptionDialog(
					null,
					"BIENVENIDO A LA CONVERSION DE TEMPERATRURAS\n"
				    + "Selecione una opcion\n"
				    +"1. De grados Centigrados a Fahrenheit\n"
				    +"2. De grados Fahrenheit a Centigrados\n",
					"Numeros", //TITLE
					JOptionPane.YES_NO_CANCEL_OPTION, //optionType
					JOptionPane.QUESTION_MESSAGE, //messageType
					null, //icon
					options, //options
					options[0]); //initialvalue

			switch (opcion)
			{
				case 1:
					Ventana = JOptionPane.showInputDialog("Ingrese los grados Centigrados");
					C = Double.parseDouble(Ventana);
					F = (C*1.8)+ 32; 
				break;
				case 2: 
					Ventana = JOptionPane.showInputDialog("Ingrese los grados Fahrenheit");
					F = Double.parseDouble(Ventana);
					C = (F-32)*(5/9);
				break;
			}
			
			JOptionPane.showMessageDialog(null, C+" grados Centigrados es igual a "+F+" grados Fahrenheit");
		}
}
