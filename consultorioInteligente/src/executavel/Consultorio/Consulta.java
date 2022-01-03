package executavel.Consultorio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import consultorioInteligente.CadastroConsulta;
import consultorioInteligente.Medico;
import consultorioInteligente.Paciente;
import consultorioInteligente.Pessoa;




public class Consulta extends Pessoa {
	
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Login: ");
		String senha = JOptionPane.showInputDialog("Senha: ");

		Medico medico1 = new Medico();
		medico1.setNome(JOptionPane.showInputDialog("Digite o nome do Médico"));
		
		List<Paciente> paciente = new ArrayList<Paciente>();
		HashMap<String, List<Paciente>> maps  = new HashMap<String, List<Paciente>>();
		
		
		for (int qtd = 0; qtd <= 1; qtd++) {

			String nome = JOptionPane.showInputDialog("Nome do Paciente: ");

			Paciente paciente1 = new Paciente();
			paciente1.setNome(nome);
			
		}
		
		System.out.println("Os pacientes " + paciente + "consultarão com a médica: "
				+ medico1.getNome());
		
	}
	

	
	
	}
	
	

