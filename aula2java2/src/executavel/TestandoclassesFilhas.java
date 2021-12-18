package executavel;

import executavel.classes.Diretor;
import executavel.classes.Secretario;
import executavel.classes.aluno;

public class TestandoclassesFilhas {
	
	public static void main(String[] args) {
			
			aluno aluno = new aluno();
		aluno.setNome(" Janaína Duarte ");
		aluno.setIdade(17);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("MG187.22.1.1");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Mestrado");
		secretario.setIdade(39);
		
		
		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
		System.out.println(aluno.pessoaMaiorIdade() + " " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
	}

}
