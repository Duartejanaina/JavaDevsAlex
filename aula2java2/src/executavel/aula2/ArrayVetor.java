package executavel.aula2;

import javax.swing.JOptionPane;

public class ArrayVetor {
	public static void main(String[] args) {
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter? ");
		double [] notas = new double[Integer.parseInt(posicoes)];
		
		for (int pos = 0; pos < notas.length; pos ++) {
			
			String valor = JOptionPane.showInputDialog("Qual o valor da posição? " + (pos +1));
			notas [pos] = Double.valueOf(valor);
			
			System.out.println(" Suas notas são: " + notas[pos]);
		}
		
	
		
	
	}

}
