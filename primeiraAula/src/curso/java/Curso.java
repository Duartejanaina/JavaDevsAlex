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

	
	String entrada = "Aten��o, esse � meu primeiro c�digo!";
	
	System.out.println(entrada);
	
	if (total >= 70 && name.equals("Pedro")) {
		System.out.println("Senhor " + name + ", voc� est� Aprovado");
	}
	
	else if (total<70) {
		System.out.println("Reprovado");
	}
	
	System.out.println("          ");
	
	/*Operadores tern�rios*/
	
	String saidaResultado;
	saidaResultado = total>=70? "Aluno Aprovado": (total >=40 && total<=69) ? "Aluno em recupera��o" : "Aluno reprovado!";
	System.out.println(saidaResultado);
	
	/*Opera��es l�gicas aninhadas*/ 
	
	if (total >= 50) {
		if (total >= 70) {
			System.out.println("Aluno aprovado, parab�ns!");
		} else {
			System.out.println("Aluno em recupera��o, vai estudar");
		} 
		
		
	} else {
		System.out.println("Reprovado direto!");
	}
	
	String nome = "Jos� da Silva";
	String cpf = "986.487.948-13";
	String endereco = "Rua Maria Joana, 22";
	
	System.out.println("Procure o Senhor " + nome + " , " + cpf + " , " + endereco + " para providenciar os documentos de admiss�o");
	
	
	if (genero1 == 'F') {
		System.out.println("Voc� se identifica com o g�nero Feminino");
	}
	
	
	System.out.println(" Providencie o seguinte c�digo " + total + " c�digo " + letra);
	
	}
	/*Operadores tern�rios*/
	
	
	

	
	
}