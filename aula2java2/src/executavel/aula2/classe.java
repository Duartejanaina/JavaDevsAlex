package executavel.aula2;


import javax.swing.JOptionPane;

import executavel.classes.aluno;


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
		String notaPortugues= JOptionPane.showInputDialog("Digite sua nota de Potuguês: ");
		String nomeProfessorPort = JOptionPane.showInputDialog("Nome do Professor: ");
		String notaMatematica = JOptionPane.showInputDialog(" Digite sua nota de Matemática: ");
		String nomeProfessorMat = JOptionPane.showInputDialog(" Nome do professor: ");
		String notaBiologia= JOptionPane.showInputDialog("Digite sua nota de Biologia: ");
		String nomeProfessorBio = JOptionPane.showInputDialog("Nome do professor: ");
		String notaGeografia= JOptionPane.showInputDialog("Digite sua nota de Geografia: ");
		String nomeProfessorGeo = JOptionPane.showInputDialog("Nome do professor: ");
		String notaFisica= JOptionPane.showInputDialog("Digite sua nota de Física: ");
		String nomeProfessorFis= JOptionPane.showInputDialog("Nome do professor: ");
		
		
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
		
		aluno2.getDisciplina().setNotaPortugues (Integer.valueOf(notaPortugues));
		aluno2.getDisciplina().setNomeProfessorPort(nomeProfessorPort);
		aluno2.getDisciplina().setNotaMatematica(Integer.valueOf(notaMatematica));
		aluno2.getDisciplina().setNomeProfessorMat(nomeProfessorMat);
		aluno2.getDisciplina().setNotaBiologia(Integer.valueOf(notaBiologia));
		aluno2.getDisciplina().setNomeProfessorBio(nomeProfessorBio);
		aluno2.getDisciplina().setNotaGeografia (Integer.valueOf(notaGeografia));
		aluno2.getDisciplina().setNomeProfessorGeo(nomeProfessorGeo);
		aluno2.getDisciplina().setNotaFisica (Integer.valueOf(notaFisica));
		aluno2.getDisciplina().setNomeProfessorFis(nomeProfessorFis);
		
		System.out.println(aluno2);
		System.out.println(" A média do aluno é: " +aluno2.getmediaGlobal());
		System.out.println("O resultado é: " + aluno2.getalunoAprovado2()); 
		
		

		
		
	
		
		
	}
}

		

		

