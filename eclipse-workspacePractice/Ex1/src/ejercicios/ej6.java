package ejercicios;

import javax.swing.JOptionPane;

public class ej6 {
	
	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Introduce el numero");
		
		int numero = Integer.parseInt(texto);
		int divisor = 2;
		
		//int pruebaLogica = (numero - (numero/divisor)* divisor);
		//System.out.println(pruebaLogica);
		
		if ((numero - (numero/divisor)* divisor) == 0) {
			System.out.println("El numero si es divisible");
		}	else {
			System.out.println("El numero no es divisible entre 2");
		}
		
	}

}
