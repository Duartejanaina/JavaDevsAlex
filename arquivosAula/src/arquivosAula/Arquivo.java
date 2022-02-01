package arquivosAula;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo extends Pessoa{
	public static void main(String[] args) throws IOException {
		
		//Crio os objetos
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Maria");
		pessoa1.setIdade("68");
		pessoa1.setEmail("maria@gmail.com");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Francisco");
		pessoa2.setIdade("34");
		pessoa2.setEmail("chico@gmail.com");
		
		//Passo a lista
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		// Adiciono cada objeto a lista
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		
		
		File arquivo = new File("C:\\curso-java\\arquivosAula\\src\\arquivosAula\\arquivo.txt");
		//Chamo o comando
		
		
		if(!arquivo.exists()) {
			arquivo.createNewFile(); //Faço um if, se não existir, crio
			
		}
		
		FileWriter escrevernoArquivo = new FileWriter(arquivo); // Crio o método para escrever
		
		
		
		escrevernoArquivo.write("Minha primeira linha na IDE"); //chamo o método
		escrevernoArquivo.write("\n"); // Quebra a linha
		escrevernoArquivo.write("Minha segunda linha na IDE");
		
		// Criando um for
		
		for(Pessoa p: pessoas) {
			escrevernoArquivo.write(p.getNome() + " , " + p.getEmail() +
					" , " + p.getIdade() + "\n");
		}
		
		
		
		
		escrevernoArquivo.flush(); //indexação
		escrevernoArquivo.close(); //fechamento
		
	
		
		
		
	}

}
