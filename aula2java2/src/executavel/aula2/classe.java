package executavel.aula2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import cursojava.constante.statusAluno;
import executavel.classes.aluno;
import executavel.classes.disciplina;

public class classe {

	public static void main(String[] args) {

		List<aluno> alunos = new ArrayList<aluno>();
		List<aluno> alunosAprovados = new ArrayList<aluno>();
		List<aluno> alunosRecuperacao = new ArrayList<aluno>();
		List<aluno> alunosReprovados = new ArrayList<aluno>();

		for (int qtd = 0; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno: ");
			/*
			 * String idade = JOptionPane.showInputDialog("Idade: "); String dataNascimento
			 * = JOptionPane.showInputDialog("Data de nascimento (XX/XX/XXXX): "); String
			 * registroGeral = JOptionPane.showInputDialog("Digite o RG: "); String
			 * numeroCPF =
			 * JOptionPane.showInputDialog("Digite o CPF (com n�meros e tra�os): "); String
			 * nomeMae = JOptionPane.showInputDialog("Nome da m�e: "); String dataMatricula
			 * = JOptionPane.showInputDialog("Data da matr�cula: "); String nomeEscola =
			 * JOptionPane.showInputDialog("Nome da Escola: "); String serieEscolar =
			 * JOptionPane.showInputDialog("Digite a s�rie/ano: ");
			 */

			aluno aluno2 = new aluno();
			aluno2.setNome(nome);
			/*
			 * aluno2.setIdade(Integer.valueOf(idade));
			 * aluno2.setDataNascimento(dataNascimento);
			 * aluno2.setRegistroGeral(registroGeral); aluno2.setNumeroCPF(nu55meroCPF);
			 * aluno2.setNomeMae(nomeMae); aluno2.setDataMatricula(dataMatricula);
			 * aluno2.setNomeEscola(nomeEscola); aluno2.setSerieEscolar(serieEscolar);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina" + pos + ": ");
				String notaDisicplina = JOptionPane.showInputDialog("Digite a nota da disciplina" + pos + ": ");
				disciplina disciplina = new disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisicplina));

				aluno2.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina;/");
			int posicao = 1;
			if (escolha == 0) {
				int continuaRemover = 0;
				while (continuaRemover == 0) {
					String disciplinaRemover = JOptionPane
							.showInputDialog("Deseja excluir qual disciplina: 1, 2, 3 ou 4? ");
					aluno2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuaRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");

				}

			}

			alunos.add(aluno2);
		}

		for (aluno aluno : alunos) {

			if (aluno.getalunoAprovado2().equalsIgnoreCase(statusAluno.APROVADO)) {
				alunosAprovados.add(aluno);

			} else
			if (aluno.getalunoAprovado2().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);

			} else if (aluno.getalunoAprovado2().equalsIgnoreCase(statusAluno.REPROVADO)) {
				alunosReprovados.add(aluno);
			}

		}
		
		System.out.println("***************Lista dos aprovados: ********************");
		for (aluno aluno : alunosAprovados) {
			System.out.println(aluno.getNome() + " seu resultado � " + aluno.getalunoAprovado2() + " e sua m�dia: " + aluno.getmediaGlobal());
		}

		
		System.out.println("***************Lista dos em Recupera��o: ********************");
		for (aluno aluno : alunosRecuperacao) {
			System.out.println(aluno.getNome() + "seu resultado �  " + aluno.getalunoAprovado2() + " e sua m�dia:  " + aluno.getmediaGlobal());
		}
		
		System.out.println("***************Lista dos Reprovados: ********************");
		for (aluno aluno : alunosReprovados) {
			System.out.println(aluno.getNome() + " seu resultado � " + aluno.getalunoAprovado2() + " e sua m�dia: " + aluno.getmediaGlobal());
		}

		/*
		 * for (int pos = 0; pos < alunos.size(); pos ++) { aluno aluno=
		 * alunos.get(pos); if (aluno.getNome().equalsIgnoreCase("alex")) { aluno trocar
		 * = new aluno (); trocar.setNome(" Aluno foi trocado");
		 * 
		 * disciplina disciplina = new disciplina();
		 * disciplina.setDisciplina("Matem�tica"); disciplina.setNota(96);
		 * 
		 * trocar.getDisciplinas().add(disciplina); alunos.set(pos, trocar); aluno =
		 * alunos.get(pos); } System.out.println("Aluno = " + aluno.getNome());
		 * System.out.println("M�dia do aluno = " +aluno.getmediaGlobal());
		 * System.out.println("Resultado = " + aluno.getalunoAprovado2());
		 * System.out.println(
		 * "***********************************************************************"); }
		 * 
		 * /*for (aluno aluno : alunos) {
		 * 
		 * if (aluno.getNome().equalsIgnoreCase("alex")) { alunos.remove(aluno); break;
		 * } else {
		 * 
		 * System.out.println(aluno); System.out.println(" A m�dia do aluno �: " +
		 * aluno.getmediaGlobal()); System.out.println("O resultado �: " +
		 * aluno.getalunoAprovado2());
		 * System.out.println("***************************************************");
		 * 
		 * } }
		 * 
		 * for (aluno aluno : alunos) {
		 * System.out.println("Alunos que sobraram na lista: ");
		 * System.out.println(aluno.getNome());
		 * System.out.println("Suas mat�rias s�o: ");
		 * 
		 * for (disciplina disciplina: aluno.getDisciplinas()) {
		 * System.out.println(disciplina.getDisciplina()); }
		 * 
		 * }
		 */
		
		

	}
}
