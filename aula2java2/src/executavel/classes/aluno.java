package executavel.classes;

public class aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomeMae;
	private String dataMatricula;
	private String nomeEscola;
	private String serieEscolar;
	private double notaPortugues;
	private double notaMatematica;
	private double notaBiologia;
	private double notaGeografia;
	private double notaFisica;
	
	
		
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieEscolar() {
		return serieEscolar;
	}

	public void setSerieEscolar(String serieEscolar) {
		this.serieEscolar = serieEscolar;
	}

	public double getNotaPortugues() {
		return notaPortugues;
	}

	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}

	public double getNotaMatematica() {
		return notaMatematica;
	}

	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}

	public double getNotaBiologia() {
		return notaBiologia;
	}

	public void setNotaBiologia(double notaBiologia) {
		this.notaBiologia = notaBiologia;
	}

	public double getNotaGeografia() {
		return notaGeografia;
	}

	public void setNotaGeografia(double notaGeografia) {
		this.notaGeografia = notaGeografia;
	}

	public double getNotaFisica() {
		return notaFisica;
	}

	public void setNotaFisica(double notaFisica) {
		this.notaFisica = notaFisica;
	}


	public double getmediaGlobal() {
		
		return (notaBiologia+notaFisica+notaGeografia+notaMatematica+notaPortugues)/5;
	}
	
	public boolean getalunoAprovado() {
		
		double media = this.getmediaGlobal();
		if (media >= 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getalunoAprovado2() {
		
		double media = this.getmediaGlobal();
		if (media >= 60) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

}
