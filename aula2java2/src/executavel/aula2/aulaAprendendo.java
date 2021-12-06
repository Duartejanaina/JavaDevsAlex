package executavel.aula2;

public class aulaAprendendo {
	public static void main(String[]args){
		
		/* Do while*/
		int numero = 0;
		
		do {
			System.out.println("O número atual é: " + numero);
			numero++;
		} while (numero<=20);
		
		/*for*/
		for (int numero1=0; numero1 <= 10; numero1++) {
			System.out.println("O numero é: " +numero1);
		}
		
		for (int numero2=10; numero2 >= 0; numero2--) {
			System.out.println("O numero é: " +numero2);
		}
		
		/*for com break*/
		
		for (int num=0; num <=10; num ++) {
			if (num == 3) {
				System.out.println("Oba! Encontrei o número");
				System.out.println("A partir de agora, o programa está encerrado.");
				break;
			}
		}
		
/*for com continuex*/
		
		for (int num=0; num <=10; num ++) {
			if (num == 3 ||num==6 ||  num==9 ) {
				System.out.println("Oba! Encontrei o número" + num);
				System.out.println("A partir de agora, o programa continua." + num);
				continue;
			}
			System.out.println("Olá!");
		
		}
	
	
	}
	
	

}
