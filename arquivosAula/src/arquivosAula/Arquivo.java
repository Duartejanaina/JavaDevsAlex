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
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Joana");
		pessoa3.setIdade("80");
		pessoa3.setEmail("ju@gmail.com");
		
		
		//Passo a lista
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		// Adiciono cada objeto a lista
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		
		File arquivo = new File("C:\\curso-java\\arquivosAula\\src\\arquivosAula\\arquivo.csv");
		//Chamo o comando
		
		
		if(!arquivo.exists()) {
			arquivo.createNewFile(); //Fa�o um if, se n�o existir, crio
			
		}
		
		FileWriter escrevernoArquivo = new FileWriter(arquivo); // Crio o m�todo para escrever
				
		// Criando um for
		
		for(Pessoa p: pessoas) {
			escrevernoArquivo.write(p.getNome() + " , " + p.getEmail() +
					" , " + p.getIdade() + "\n");
		}
		
		
		escrevernoArquivo.flush(); //indexa��o
		escrevernoArquivo.close(); //fechamento
		
	
		
		
		
	}

}
