package consultorioInteligente;

public class Paciente extends Pessoa {
	
	private int idCod;
	private String convenio;
	private String diagnosticoCID;
	
	
	public int getIdCod() {
		return idCod;
	}
	public void setIdCod(int idCod) {
		this.idCod = idCod;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getDiagnosticoCID() {
		return diagnosticoCID;
	}
	public void setDiagnosticoCID(String diagnosticoCID) {
		this.diagnosticoCID = diagnosticoCID;
	}
	@Override
	public String toString() {
		return "Paciente [idCod=" + idCod + ", convenio=" + convenio + ", diagnosticoCID=" + diagnosticoCID
				+ ", getIdCod()=" + getIdCod() + ", getConvenio()=" + getConvenio() + ", getDiagnosticoCID()="
				+ getDiagnosticoCID() + ", getNome()=" + getNome() + ", toString()=" + super.toString()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getEndereco()=" + getEndereco() + ", getCPF()="
				+ getCPF() + ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
