package testeJogo;

import javax.swing.JOptionPane;

public class testeGameidade {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Olá, gamer! Seja bem-vindo. Qual o seu nome?");
		String idade = JOptionPane.showInputDialog("Digite a sua idade:");
		double numeroIdade = Double.parseDouble(idade);
		
		if (numeroIdade >= 18) {
			JOptionPane.showConfirmDialog(null,"Acesso Permitido, bem-vinda" + nome);
			
			String jogo = JOptionPane.showInputDialog("Selecione 1 para FarCry ou 2 para Free Fire");
			double jogoescolha = Double.parseDouble(jogo);
			if (jogoescolha == 1) {
				JOptionPane.showConfirmDialog(null, "Welcome to The Jung");
				
			}
			if (jogoescolha ==2) {
				JOptionPane.showConfirmDialog(null, "Escolha sua skin");
			}
			
			int resultado = JOptionPane.showConfirmDialog(null, "Você gostou do nosso game?");
			
			if (resultado ==0) {
				JOptionPane.showInputDialog("Volte sempre!");
			}
			
			if (resultado == 1) {
				JOptionPane.showInputDialog("Sentimos muito!");
			}
			
			
			JOptionPane.showConfirmDialog(null, "Obrigada por jogar!");
			
		} else
			JOptionPane.showConfirmDialog(null, "Acesso NEGADO, procure seu responsável");
	}

}
