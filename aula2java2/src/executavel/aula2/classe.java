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
		
		
		disciplina disciplina1  = new disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		aluno2.getDisciplinas().add(disciplina1);
		

		disciplina disciplina2  = new disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(98);
		aluno2.getDisciplinas().add(disciplina2);
		
		disciplina disciplina3  = new disciplina();
		disciplina3.setDisciplina("Java Web");
		disciplina3.setNota(97);
		aluno2.getDisciplinas().add(disciplina3);
		
		
		disciplina disciplina4  = new disciplina();
		disciplina4.setDisciplina("Lógica de Programação");
		disciplina4.setNota(89);
		aluno2.getDisciplinas().add(disciplina4);	
		
		System.out.println(aluno2);
		System.out.println(" A média do aluno é: " +aluno2.getmediaGlobal());
		System.out.println("O resultado é: " + aluno2.getalunoAprovado2()); 
		
		

		
	
		
		
	}
}

		

		

