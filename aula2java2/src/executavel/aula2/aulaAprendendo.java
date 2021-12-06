package executavel.aula2;

public class aulaAprendendo {
	public static void main(String[]args){
		int numero = 0;
		
		do {
			System.out.println("O número atual é: " + numero);
			numero++;
		} while (numero<=20);
		
		for (int numero1=0; numero1 <= 10; numero1++) {
			System.out.println("O numero é: " +numero1);
		}
		
		for (int numero2=10; numero2 >= 0; numero2--) {
			System.out.println("O numero é: " +numero2);
		}
	}

}
