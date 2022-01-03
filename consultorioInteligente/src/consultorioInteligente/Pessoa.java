package consultorioInteligente;

public abstract class Pessoa {
	
	protected String nome;
	protected String dataNascimento;
	protected String endereco;
	protected String CPF;
	protected int telefone;
	
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", CPF=" + CPF
				+ ", telefone=" + telefone + "]";
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
	public String getCPF() {
		return CPF;
	}
	public void setCPF1(String string) {
		CPF = string;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
