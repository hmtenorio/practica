package ejercicios;

import javax.swing.JOptionPane;

public class ej5 {
	
	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Introduce el radio");
		
		double radio = Double.parseDouble(texto);
		double area = (Math.PI * (Math.pow(radio, 2)));
		
		System.out.println("El area es: " + area);
	}

}
