package executavel.aula2;


import executavel.classes.aluno;

public class classe {
	public static void main(String[]args) {
		
		/* Objeto ainda não existe na memória, está inválido*/
		
		aluno aluno1;
	
		
		/* AGora temos um objeto:*/
		
		
		aluno aluno2= new aluno(); /*Maria*/
		aluno2.setNome("Maria");
		aluno2.setIdade(17);
		aluno2.setNomeEscola("E E São Salvador");
		aluno2.setNotaBiologia(60);
		aluno2.setNotaFisica(80);
		aluno2.setNotaGeografia(65);
		aluno2.setNotaMatematica(42);
		aluno2.setNotaPortugues(67);
		
		
		System.out.println("O nome da aluna é: " + aluno2.getNome());
		System.out.println("A idade é: " + aluno2.getIdade());
		System.out.println("Sua escola é " + aluno2.getNomeEscola());
		System.out.println("A média gloval é " + aluno2.getmediaGlobal());
		System.out.println("Resultado global do aluno " + aluno2.getalunoAprovado2());
		System.out.println("Resultado global do aluno " + aluno2.getalunoAprovado());
		
		
		
		
		aluno aluno3 = new aluno(); /*João*/ 
		aluno aluno4 = new aluno(); /*Paula*/
	
		
		
	}

}
