package consultorioInteligente;

public class Medico extends Pessoa{
	
	private int crm;

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", getCrm()=" + getCrm() + ", getNome()=" + getNome() + ", toString()="
				+ super.toString() + ", getDataNascimento()=" + getDataNascimento() + ", getEndereco()=" + getEndereco()
				+ ", getCPF()=" + getCPF() + ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
