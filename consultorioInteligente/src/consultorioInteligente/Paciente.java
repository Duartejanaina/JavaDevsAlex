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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((convenio == null) ? 0 : convenio.hashCode());
		result = prime * result + ((diagnosticoCID == null) ? 0 : diagnosticoCID.hashCode());
		result = prime * result + idCod;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (convenio == null) {
			if (other.convenio != null)
				return false;
		} else if (!convenio.equals(other.convenio))
			return false;
		if (diagnosticoCID == null) {
			if (other.diagnosticoCID != null)
				return false;
		} else if (!diagnosticoCID.equals(other.diagnosticoCID))
			return false;
		if (idCod != other.idCod)
			return false;
		return true;
	}
	
	

}
