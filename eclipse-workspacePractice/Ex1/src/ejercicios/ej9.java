package ejercicios;

import javax.swing.JOptionPane;

public class ej9 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Introduce el numero");

		double numero = Double.parseDouble(texto);
		double iva = 0.21;
		
		double calculo = (numero*iva)+numero;
		
		System.out.println("El precio con IVA es: " + calculo);
		
	}
	
}
