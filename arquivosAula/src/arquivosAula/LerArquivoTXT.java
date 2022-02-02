package arquivosAula;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTXT {

	// Método main para rodar

	public static void main(String[] args) throws FileNotFoundException {
		 
		 // Fazer a entrada de dados com o método FIleInputStream Javai	 
		 
		 FileInputStream entradaArquivo = new FileInputStream(new File("C:\\curso-java\\arquivosAula\\src\\arquivosAula\\arquivo.csv"));
		 // Método           //Nome que dei  //Chamo um novo // para abrir o meu arquivo
		 
		 //Agora vou ler o arquivo Scanner Java util
		 
		 Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		 // Ler  //Nome do objet // Novo  //Puxo o entrada que declarei lá em cima
		 //UTF 8 é porque meu arquivo tem separadores em ;
		 
		 
		 List<Pessoa> pessoas = new ArrayList<Pessoa>();
		 
		 // Vou chamar o método While para o pc entender que
		 // Enquanto eu tiver o arquivo eu vou ler
		 
		 
		 while(lerArquivo.hasNext()) {
			 
			 String linha = lerArquivo.nextLine();
			 
			 // Quero ignorar uma linha em branco
			 
			 if (linha != null && !linha.isEmpty()) { // Só quero linhas preenchidas	
		
			 // Vamos trazer do arquivo e colocar em uma lista de pessoas
			 
			 // Fazer um array de string- dados
			 
			 String[] dados = linha.split("\\,");
			                  // Split é separar é meu delimitador
			 
			 Pessoa pessoa= new Pessoa();
			 
			 pessoa.setNome(dados[0]); // indexação o nome é minha primeira posição
			 pessoa.setEmail(dados[1]); // posição dois
			 pessoa.setIdade(dados[2]); // No caso eu coloquei a idade como String
			 // Se eu tivesse colocado como inteiro, teria que executar o seguinte
			 // comando (Integer.parseInt(dados[2]);
			 
			 // AGora vou lá em cima, fora do while e criar umma lista de pessoas
			 
			 // Depois de criar minha lista vou adicionar 
			 
			 pessoas.add(pessoa);
			 
		 }

		 
		 
		
	}
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		 

}
}