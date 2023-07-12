package ejercicios;

import javax.swing.JOptionPane;

public class ej8 {

	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog("Introduce el codigo ASCII:");

		char ascii = texto.charAt(0);
		int codigo = (int)ascii;

		System.out.println("El codigo ASCII que corresponde a " + ascii + " es: " + codigo);

	}

}
