package curso.java;

public class Curso {
	
	public static void main(String[] args) {
		
	int nota1 = 70;
	int nota2 = 30;
	double nota3 = 90;
	
	double total = 0;
	
	char letra = 'D';
	
	total = (nota1 + nota2 + nota3)/3;
	
	char genero1 = 'F';
	char genero2 = 'X';
	char genero3 = 'M';

	
	String entrada = "Aten��o, esse � meu primeiro c�digo!";
	
	System.out.println(entrada);
	
	String nome = "Jos� da Silva";
	String cpf = "986.487.948-13";
	String endereco = "Rua Maria Joana, 22";
	
	System.out.println("Ol� " + nome + " , " + cpf + " , " + endereco);
	
	
	if (genero1 == 'F') {
		System.out.println("Voc� se identifica com o g�nero Feminino");
	}
	
	if (genero2 == 'X') {
		System.out.println("Voc� se identifica com g�nero neutro");
	}
	
	if (genero3 == 'M') {
		System.out.println("Voc� se identifica com o g�nero masculino");
	}
	
	System.out.println(" O total � " + total + " c�digo " + letra);
	
	}
	
}