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

	
	String entrada = "Atenção, esse é meu primeiro código!";
	
	System.out.println(entrada);
	
	String nome = "José da Silva";
	String cpf = "986.487.948-13";
	String endereco = "Rua Maria Joana, 22";
	
	System.out.println("Olá " + nome + " , " + cpf + " , " + endereco);
	
	
	if (genero1 == 'F') {
		System.out.println("Você se identifica com o gênero Feminino");
	}
	
	if (genero2 == 'X') {
		System.out.println("Você se identifica com gênero neutro");
	}
	
	if (genero3 == 'M') {
		System.out.println("Você se identifica com o gênero masculino");
	}
	
	System.out.println(" O total é " + total + " código " + letra);
	
	}
	
}