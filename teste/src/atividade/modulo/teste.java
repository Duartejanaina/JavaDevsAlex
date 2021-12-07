package atividade.modulo;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[]args) {
		
		
		String carro = JOptionPane.showInputDialog("Informe a quantidade de carros:");
		System.out.println(carro);
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoa:");
		System.out.println(pessoa);
		System.out.println("Ao repartir a herança de " + carro + "para"  + pessoa + "filhos");
		
		double carroNumero = Double.parseDouble(carro);
		double pessoaNumero = Double.parseDouble(pessoa);
		
		double total = carroNumero % pessoaNumero;
		
		System.out.println("Ainda sobrou " + total + " carro " + "para os tios das garotas");
	}

}
