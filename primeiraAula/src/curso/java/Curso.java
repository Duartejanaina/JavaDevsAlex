package curso.java;

public class Curso {
	
	public static void main(String[] args) {
		
	/*Declaracao de variaveis*/ 
	int nota1 = 70;
	int nota2 = 80;
	double nota3 = 90;
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
	
	String nome = "Jos� da Silva";
	String cpf = "986.487.948-13";
	String endereco = "Rua Maria Joana, 22";
	
	System.out.println("Procure o Senhor " + nome + " , " + cpf + " , " + endereco + "para providenciar os documentos de admiss�o");
	
	
	if (genero1 == 'F') {
		System.out.println("Voc� se identifica com o g�nero Feminino");
	}
	
	
	System.out.println(" Providencie o seguinte c�digo " + total + " c�digo " + letra);
	
	}
	
	

	
	
}