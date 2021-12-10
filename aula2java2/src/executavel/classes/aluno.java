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
	
	private disciplina disciplina = new disciplina();
	public void setDisciplina(disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public disciplina getDisciplina() {
		return disciplina;
	}
	

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


	public double getmediaGlobal() {
		
		return (disciplina.getNotaBiologia() + disciplina.getNotaFisica() + disciplina.getNotaGeografia() 
		+ disciplina.getNotaMatematica()+disciplina.getNotaPortugues())/5;
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
	@Override
	public String toString() {
		return "aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", dataMatricula="
				+ dataMatricula + ", nomeEscola=" + nomeEscola + ", serieEscolar=" + serieEscolar + ", disciplina="
				+ disciplina + ", getDisciplina()=" + getDisciplina() + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getDataNascimento()=" + getDataNascimento() + ", getRegistroGeral()="
				+ getRegistroGeral() + ", getNumeroCPF()=" + getNumeroCPF() + ", getNomeMae()=" + getNomeMae()
				+ ", getDataMatricula()=" + getDataMatricula() + ", getNomeEscola()=" + getNomeEscola()
				+ ", getSerieEscolar()=" + getSerieEscolar() + ", getmediaGlobal()=" + getmediaGlobal()
				+ ", getalunoAprovado()=" + getalunoAprovado() + ", getalunoAprovado2()=" + getalunoAprovado2()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	

}
