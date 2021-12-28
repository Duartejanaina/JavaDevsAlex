package executavel.Consultorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import consultorioInteligente.CadastroConsulta;
import consultorioInteligente.Medico;
import consultorioInteligente.Paciente;
import consultorioInteligente.Pessoa;


public class Consulta extends Pessoa {
	
	public static void main(String[] args) {
			
	Paciente paciente = new Paciente();
	paciente.setConvenio("Unimed");
	paciente.setEndereco("Alameda Jorge Luiz, 45, Santa Teresa, BH");
	paciente.setIdCod(0001);
	paciente.setCPF(9411);
	paciente.setConvenio("Bradesco");
	paciente.setNome("pedro");
	
	Medico medico = new Medico();
	medico.setCrm(1223);
	medico.setNome("Joao");
	
	CadastroConsulta cadastroConsulta = new CadastroConsulta ();
	cadastroConsulta.setHorario("17:30");
	
	System.out.println(paciente.getNome());
	
	}
	

	
	
	}
	
	

