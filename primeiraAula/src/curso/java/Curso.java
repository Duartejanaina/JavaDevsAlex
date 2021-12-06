package curso.java;

public class Curso {
	
	public static void main(String[] args) {
		
	/*Declaracao de variaveis*/ 
	int nota1 = 10;
	int nota2 = 20;
	double nota3 = 10;
	double total = 0;
	char letra = 'D';
	char genero1 = 'F';
	char genero2 = 'X';
	char genero3 = 'M';
	
	String name = "Pedro";
	total = (nota1 + nota2 + nota3)/3;

	
	String entrada = "Atenção, esse é meu primeiro código!";
	
	System.out.println(entrada);
	
	if (total >= 70 && name.equals("Pedro")) {
		System.out.println("Senhor " + name + ", você está Aprovado");
	}
	
	else if (total<70) {
		System.out.println("Reprovado");
	}
	
	System.out.println("          ");
	
	/*Operadores ternários*/
	
	String saidaResultado;
	saidaResultado = total>=70? "Aluno Aprovado": (total >=40 && total<=69) ? "Aluno em recuperação" : "Aluno reprovado!";
	System.out.println(saidaResultado);
	
	/*Operações lógicas aninhadas*/ 
	
	if (total >= 50) {
		if (total >= 70) {
			System.out.println("Aluno aprovado, parabéns!");
		} else {
			System.out.println("Aluno em recuperação, vai estudar");
		} 
		
		
	} else {
		System.out.println("Reprovado direto!");
	}
	
	String nome = "José da Silva";
	String cpf = "986.487.948-13";
	String endereco = "Rua Maria Joana, 22";
	
	System.out.println("Procure o Senhor " + nome + " , " + cpf + " , " + endereco + " para providenciar os documentos de admissão");
	
	
	if (genero1 == 'F') {
		System.out.println("Você se identifica com o gênero Feminino");
	}
	
	
	System.out.println(" Providencie o seguinte código " + total + " código " + letra);
	
	}
	/*Operadores ternários*/
	
	
	

	
	
}