package arquivosAula;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File ("C:\\curso-java\\arquivosAula\\src\\arquivosAula\\arquivoExcel.xls");
		
		//Se não tiver, eru crio
		if(!file.exists()) {
			file.createNewFile();
		}
		
		// Na aula anterior, fizemos uma lista de pessoas, vou copiar lá
		// para ter dados para inserir na planilha
		
		
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
		
		//Vou inserir o método da biblioteca Apache Poi
		HSSFWorkbook hSSWorkBook = new HSSFWorkbook();
		// usado para escrever a planilha
		            // De amarelo é o nome que eu dei para manipular
		
		HSSFSheet linhasPessoa = hSSWorkBook.createSheet("Planilha Treinamento");
		// Método HSSFSheet criar a planilha
		// Crio o objeto linhasPessoa, chamo o objeto que criei e adiciono ao criar planilha
		
		
		// Criar um número de linhas por fora do for
		int numeroLinhas = 0;
		
		
		// Fazer um for agora foreach
		// Varrer a lista de pessoa		
		for (Pessoa p : pessoas) {
			// Para cada pessoa vou criar uma linha, e cada nome, email é coluna, um atributo
			//Dentro do for vou chamar o método Row do Apache Poi, Row= linha
			
			Row linha = linhasPessoa.createRow(numeroLinhas ++);
			// Criando a linha na planilha
			
			// Agora vou criar as células
			int celula = 0;
			
			// Agora vou pegar o objeto Cell
			// Criar uma célula pra cada atributo
			Cell celulaNome = linha.createCell(celula ++); // Para ir incrementadno
			celulaNome.setCellValue(p.getNome()); // Na célula de nome
			// vou chamar o nome da pessoa. get|"
			
			Cell celulaEmail = linha.createCell(celula ++); // Para ir incrementadno
			celulaEmail.setCellValue(p.getEmail());
			
			Cell celulaIdade = linha.createCell(celula ++); // Para ir incrementadno
			celulaIdade.setCellValue(p.getIdade());
		
			
		} // Saindo do For
		
		// Terminou de montar a planilha, precisamos fazer uma saída
		
		FileOutputStream saida = new FileOutputStream(file); //Carrega a planilha
		hSSWorkBook.write(saida); // Ele carrega e escreve na planilha
		// Do mesmo jeito com txt e csv, a saída tem que dar um flush e fechar
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada!");
				
		
	}

}
