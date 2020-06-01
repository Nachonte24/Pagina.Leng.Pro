import javax.swing.JOptionPane;

public class T16MultiMatrices
{
	public static void main (String[] arg)
	{
		String ventana, mensaje="";
		int i, n, m, o, p, j, k;
			JOptionPane.showMessageDialog(null, "BIENVENIDO A LA MULTIPLICACION DE MATRICES\n");
			//DECLARACION DE MATRICES
			//PRIMERA MATRIZ
			JOptionPane.showMessageDialog(null,"Vamos a empezar declarando las dimensiones de la PRIMERA matriz ");
			ventana = JOptionPane.showInputDialog("Introduzca el numero de filas");
			n = Integer.parseInt(ventana);
			ventana = JOptionPane.showInputDialog("Introduzca el numero de columnas");
			m = Integer.parseInt(ventana);
			int A[][] = new int [n][m];
			JOptionPane.showMessageDialog(null, "Ahora rellenaremos la PRIMERA Matriz");
			for(i=0; i<n; i++)
			{
				for(j=0; j<m; j++)
				{
					ventana = JOptionPane.showInputDialog("Introduzca el numero en A["+i+"]["+j+"]: ");
					A[i][j] = Integer.parseInt(ventana);
				}
			}
			//SEGUNDO MATRIZ
			JOptionPane.showMessageDialog(null,"Vamos a empezar declarando las dimensiones de la SEGUNDA matriz ");
			ventana = JOptionPane.showInputDialog("Introduzca el numero de filas");
			o = Integer.parseInt(ventana);
			ventana = JOptionPane.showInputDialog("Introduzca el numero de columnas");
			p = Integer.parseInt(ventana);
			int B[][] = new int [o][p];
			JOptionPane.showMessageDialog(null, "Ahora rellenaremos la SEGUNDA Matriz");
			for(i=0; i<o; i++)
			{
				for(j=0; j<p; j++)
				{
					ventana = JOptionPane.showInputDialog("Introduzca el numero en B["+i+"]["+j+"]: ");
					B[i][j] = Integer.parseInt(ventana);
				}
			}
			//VALIDACION PARA LA MULTIPLICACION DE MATRICES
			if(m!=o)
			{
				JOptionPane.showMessageDialog(null, "NO SE PUEDE SEGUIR CON LA MULTIPLICACION\n"
						+ "Las dimensiones de ambas matrices no son iguales\n"
						+ "Intente de nuevo");
				System.exit(0);
			}
			//DECLARACION DE UNA MATRIZ DE RESULTADO
			int C[][] = new int [n][p];
			//MULTIPLICACION DE MATRICES
			for ( i = 0; i < n; i++) {
	            for ( j = 0; j < p; j++) {
	                for ( k = 0; k < m; k++) {
	                    // aquí se multiplica la matriz
	                    C[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
	    
			//IMPRESION DE MATRIZ
			mensaje = "MATRIZ A\n";
			for(i=0; i<n; i++)
			{
				for(j=0; j<m; j++)
				{
					mensaje=mensaje+A[i][j]+", ";
				}
				mensaje=mensaje+"\n";
			}
			mensaje =mensaje+ "MATRIZ B\n";
			for(i=0; i<o; i++)
			{
				for(j=0; j<p; j++)
				{
					mensaje=mensaje+B[i][j]+", ";
				}
				mensaje=mensaje+"\n";
			}
			mensaje =mensaje+ "MATRIZ RESULTADO\n";
			for(i=0; i<n; i++)
			{
				for(j=0; j<p; j++)
				{
					mensaje=mensaje+C[i][j]+", ";
				}
				mensaje=mensaje+"\n";
			}
			JOptionPane.showMessageDialog(null, mensaje);
			
	}
}
