package consultorioInteligente;

public abstract class Pessoa {
	
	protected static String nome;
	protected static String dataNascimento;
	protected static String endereco;
	protected static int CPF;
	protected static int telefone;
	
	
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Pessoa [getNome()=" + getNome() + ", getDataNascimento()=" + getDataNascimento() + ", getEndereco()="
				+ getEndereco() + ", getCPF()=" + getCPF() + ", getTelefone()=" + getTelefone() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
