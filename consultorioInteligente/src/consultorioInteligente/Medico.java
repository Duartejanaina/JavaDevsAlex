package consultorioInteligente;

import java.util.ArrayList;
import java.util.List;

import consultorioInteligente.Interface.AcessoAutorizacao;

public class Medico extends Pessoa implements AcessoAutorizacao{
	
	private String crm;
	private String especializacao;

	
	private List<Paciente> pacientes = new ArrayList<Paciente>();

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crm == null) ? 0 : crm.hashCode());
		result = prime * result + ((especializacao == null) ? 0 : especializacao.hashCode());
		result = prime * result + ((pacientes == null) ? 0 : pacientes.hashCode());
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
		Medico other = (Medico) obj;
		if (crm == null) {
			if (other.crm != null)
				return false;
		} else if (!crm.equals(other.crm))
			return false;
		if (especializacao == null) {
			if (other.especializacao != null)
				return false;
		} else if (!especializacao.equals(other.especializacao))
			return false;
		if (pacientes == null) {
			if (other.pacientes != null)
				return false;
		} else if (!pacientes.equals(other.pacientes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", especializacao=" + especializacao + ", pacientes=" + pacientes + "]";
	}


	
	@Override
	public boolean autenticar(String user, String password) {
		return user.equals("admin") && password.equals("2022");
	}

	

}
