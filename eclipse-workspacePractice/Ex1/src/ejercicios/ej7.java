package ejercicios;

import javax.swing.JOptionPane;

public class ej7 {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog("Introduce el numero");

		int numero = Integer.parseInt(texto);
		char ascii = (char) numero;
		
		System.out.println("El codigo ASCII que corresponde a " + numero + " es: " + ascii);

	}

}
