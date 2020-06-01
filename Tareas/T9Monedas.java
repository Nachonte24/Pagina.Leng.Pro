/*  NOMBRE : OSCAR IGNACIO GUAJARDO HERNANDEZ
MATRICULA : 1865021  HORA: V4-6;*/

import javax.swing.JOptionPane;

public class T9Monedas
{
	public static void main (String[] arg)
	{
		String Ventana;
		double pesos = 0,dolar = 0, euro=0, yen=0, dolarhk=0, conversion=0;
		String[] options = {"Cancelar", "Dolar", "Euro", "Yen", "DolarHK"};
		
		int opcion = JOptionPane.showOptionDialog(
				null,
				"BIENVENIDO A LA SERIE\n"
			    + "En este programa se convertira de pesos a la moneda que desee\n"
			    +"Presione a que moneda desea convertir hoy\n",
				"Numeros", //TITLE
				JOptionPane.YES_NO_CANCEL_OPTION, //optionType
				JOptionPane.QUESTION_MESSAGE, //messageType
				null, //icon
				options, //options
				options[0]); //initialvalue
		Ventana = JOptionPane.showInputDialog("Ingrese la cantidad de pesos a convertir:");
		pesos = Double.parseDouble(Ventana);
		String mensaje = "";
		switch (opcion)
		{
			case 1: //dolar
				conversion=pesos/22;
				mensaje=" dolares";
			break;
			case 2: //euro
				conversion=pesos/24.79;
				mensaje=" euros";
			break;
			case 3: //yen
				conversion=pesos/0.21;
				mensaje=" yenes";
			break;
			case 4: //dolarhk
				conversion=pesos/2.93;
				mensaje=" dolares de hong kong";
			break;
		}
		
		JOptionPane.showMessageDialog(null, pesos+" pesos es igual a "+conversion+mensaje);
	}
}
