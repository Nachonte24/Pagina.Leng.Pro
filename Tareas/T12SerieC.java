/*  NOMBRE : OSCAR IGNACIO GUAJARDO HERNANDEZ
MATRICULA : 1865021  HORA: V4-6;*/

import javax.swing.JOptionPane;

public class T12SerieC
{
	public static void main(String[] args) {

		String ventana, mensaje = "";
		int posDeseada, posicion = 1, nPos = 2, nNeg = -3, k=0;
		boolean positivo = true;
		ventana = JOptionPane.showInputDialog("BIENVENIDO A LA SERIE C"
				+ "Introduzca la posicion que desea llegar");
		posDeseada = Integer.parseInt(ventana);
		

		for (int i = 1; i < posDeseada; i++)
		{
			if (positivo) {
				for (int y = 1; y <= posicion; y++) {
					if (k >= posDeseada) {
						JOptionPane.showMessageDialog(null, mensaje);
						System.exit(0);
					} else {
						mensaje += nPos + ", ";
						nPos += 2;
						k++;
					}
				}
				positivo = false;
				posicion++;
			} else {
				for (int y = 1; y <= 3; y++) {
					if (k >= posDeseada) {
						JOptionPane.showMessageDialog(null, mensaje);
						System.exit(0);
					} else {
						mensaje += nNeg + ", ";
						nNeg -= 2;
						k++;
					}
				}
				positivo = true;
			}
		}
	}
}
