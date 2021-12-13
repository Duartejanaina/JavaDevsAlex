package executavel.aula2;


import javax.swing.JOptionPane;

import executavel.classes.aluno;
import executavel.classes.disciplina;


public class classe {
	public static void main(String[]args) {
		
	
		/* Objeto ainda não existe na memória, está inválido*/
		
		/*aluno aluno1;
	
		
		/*AGora temos um objeto:*/
		
		String nome = JOptionPane.showInputDialog("Nome do aluno: ");
		String idade= JOptionPane.showInputDialog("Idade: ");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento (XX/XX/XXXX): ");
		String registroGeral = JOptionPane.showInputDialog("Digite o RG: ");
		String numeroCPF = JOptionPane.showInputDialog("Digite o CPF (com números e traços): ");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe: ");
		String dataMatricula = JOptionPane.showInputDialog("Data da matrícula: ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola: ");
		String serieEscolar = JOptionPane.showInputDialog("Digite a série/ano: ");
		
		
		
		aluno aluno2 = new aluno();
		aluno2.setNome(nome);
		aluno2.setIdade(Integer.valueOf(idade));
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setRegistroGeral(registroGeral);
		aluno2.setNumeroCPF(numeroCPF);
		aluno2.setNomeMae(nomeMae);
		aluno2.setDataMatricula(dataMatricula);
		aluno2.setNomeEscola(nomeEscola);
		aluno2.setSerieEscolar(serieEscolar);
		
		
		for (int pos =1; pos <=4; pos ++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina" + pos + ": ");
			String notaDisicplina = JOptionPane.showInputDialog("Digite a nota da disciplina" + pos + ": ");
			disciplina disciplina = new disciplina ();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisicplina));
			
			aluno2.getDisciplinas().add(disciplina);
		}
		
		System.out.println(aluno2);
		System.out.println(" A média do aluno é: " +aluno2.getmediaGlobal());
		System.out.println("O resultado é: " + aluno2.getalunoAprovado2()); 
		
		

		
	
		
		 
	}
}

		

		

