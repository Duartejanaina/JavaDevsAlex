package executavel.Consultorio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import consultorioInteligente.Medico;
import consultorioInteligente.Paciente;
import consultorioInteligente.Pessoa;
import consultorioInteligente.Interface.AcessoAutorizacao;

public class Consulta extends Pessoa {
	
	public static void main(String[] args) {
		
		try {
		
		String user = JOptionPane.showInputDialog(" Informe o usuário: ");
		String password = JOptionPane.showInputDialog(" Digite sua senha de 4 dígitos: ");
		
	
		
		if ( new Medico().autenticar(user,password)) {
		
		Medico medico1 = new Medico();
		medico1.setNome(JOptionPane.showInputDialog("Digite o nome do médico: "));
		medico1.setEspecializacao(JOptionPane.showInputDialog("Digite e especialização: "));
		
		
		for (int pos = 1; pos < 3; pos ++) {
			String nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente: " +pos+" ? ");
			String convenioPaciente = JOptionPane.showInputDialog("Digite o nome do convênio: " +pos+" ? ");
			String cidPaciente = JOptionPane.showInputDialog("CID ");
			
			Paciente paciente = new Paciente();
			paciente.setNome(nomePaciente);
			paciente.setConvenio(convenioPaciente);
			paciente.setDiagnosticoCID(cidPaciente);
			
			medico1.getPacientes().add(paciente);
			
			
		}
		
		
		
		System.out.println(medico1 + paciente.getNome(nomePaciente());
		
	
		} else
			JOptionPane.showConfirmDialog(null, "ACESSO NÃO AUTORIZADO");
	


		
	} catch (Exception e) { 
		StringBuilder saida = new StringBuilder();
		e.printStackTrace();
		System.out.println("O cadastro encontra-se incorreto. " + e.getMessage());
		for (int pos = 0; pos < e.getStackTrace().length; pos ++) {
			
			saida.append(" Classe de erro " + e.getStackTrace()[pos].getClassName());
			
		}
		// TODO: handle exception
	}
	
	
	
	}
	
}
	

