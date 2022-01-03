package consultorioInteligente;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa{
	
	private int crm;
	
	
	private List<Paciente> paciente = new ArrayList<Paciente>();
	
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
