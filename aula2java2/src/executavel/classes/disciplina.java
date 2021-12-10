package executavel.classes;

public class disciplina {
	private double notaPortugues;
	private String nomeProfessorPort; 
	private double notaMatematica;
	private String nomeProfessorMat; 
	private double notaBiologia;
	private String nomeProfessorBio; 
	private double notaGeografia;
	private String nomeProfessorGeo; 
	private double notaFisica;
	private String nomeProfessorFis;
	
	
	public double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
	public String getNomeProfessorPort() {
		return nomeProfessorPort;
	}
	public void setNomeProfessorPort(String nomeProfessorPort) {
		this.nomeProfessorPort = nomeProfessorPort;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public String getNomeProfessorMat() {
		return nomeProfessorMat;
	}
	public void setNomeProfessorMat(String nomeProfessorMat) {
		this.nomeProfessorMat = nomeProfessorMat;
	}
	public double getNotaBiologia() {
		return notaBiologia;
	}
	public void setNotaBiologia(double notaBiologia) {
		this.notaBiologia = notaBiologia;
	}
	public String getNomeProfessorBio() {
		return nomeProfessorBio;
	}
	public void setNomeProfessorBio(String nomeProfessorBio) {
		this.nomeProfessorBio = nomeProfessorBio;
	}
	public double getNotaGeografia() {
		return notaGeografia;
	}
	public void setNotaGeografia(double notaGeografia) {
		this.notaGeografia = notaGeografia;
	}
	public String getNomeProfessorGeo() {
		return nomeProfessorGeo;
	}
	public void setNomeProfessorGeo(String nomeProfessorGeo) {
		this.nomeProfessorGeo = nomeProfessorGeo;
	}
	public double getNotaFisica() {
		return notaFisica;
	}
	public void setNotaFisica(double notaFisica) {
		this.notaFisica = notaFisica;
	}
	public String getNomeProfessorFis() {
		return nomeProfessorFis;
	}
	public void setNomeProfessorFis(String nomeProfessorFis) {
		this.nomeProfessorFis = nomeProfessorFis;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeProfessorBio == null) ? 0 : nomeProfessorBio.hashCode());
		result = prime * result + ((nomeProfessorFis == null) ? 0 : nomeProfessorFis.hashCode());
		result = prime * result + ((nomeProfessorGeo == null) ? 0 : nomeProfessorGeo.hashCode());
		result = prime * result + ((nomeProfessorMat == null) ? 0 : nomeProfessorMat.hashCode());
		result = prime * result + ((nomeProfessorPort == null) ? 0 : nomeProfessorPort.hashCode());
		long temp;
		temp = Double.doubleToLongBits(notaBiologia);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(notaFisica);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(notaGeografia);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(notaMatematica);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(notaPortugues);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		disciplina other = (disciplina) obj;
		if (nomeProfessorBio == null) {
			if (other.nomeProfessorBio != null)
				return false;
		} else if (!nomeProfessorBio.equals(other.nomeProfessorBio))
			return false;
		if (nomeProfessorFis == null) {
			if (other.nomeProfessorFis != null)
				return false;
		} else if (!nomeProfessorFis.equals(other.nomeProfessorFis))
			return false;
		if (nomeProfessorGeo == null) {
			if (other.nomeProfessorGeo != null)
				return false;
		} else if (!nomeProfessorGeo.equals(other.nomeProfessorGeo))
			return false;
		if (nomeProfessorMat == null) {
			if (other.nomeProfessorMat != null)
				return false;
		} else if (!nomeProfessorMat.equals(other.nomeProfessorMat))
			return false;
		if (nomeProfessorPort == null) {
			if (other.nomeProfessorPort != null)
				return false;
		} else if (!nomeProfessorPort.equals(other.nomeProfessorPort))
			return false;
		if (Double.doubleToLongBits(notaBiologia) != Double.doubleToLongBits(other.notaBiologia))
			return false;
		if (Double.doubleToLongBits(notaFisica) != Double.doubleToLongBits(other.notaFisica))
			return false;
		if (Double.doubleToLongBits(notaGeografia) != Double.doubleToLongBits(other.notaGeografia))
			return false;
		if (Double.doubleToLongBits(notaMatematica) != Double.doubleToLongBits(other.notaMatematica))
			return false;
		if (Double.doubleToLongBits(notaPortugues) != Double.doubleToLongBits(other.notaPortugues))
			return false;
		return true;
	} 
	

}
