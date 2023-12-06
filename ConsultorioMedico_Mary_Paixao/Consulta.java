package ConsultorioMedico_Mary_Paixao;

import java.util.List;

public class Consulta {
	private List <Paciente> Paciente;
	private Medico medico;
	
	public Consulta () {
	}

	public Consulta( List <Paciente> Paciente , Medico m) {
		this.Paciente = Paciente;
		this.medico=m;
	}
	

	public List <Paciente> getPaciente() {
		return Paciente;
	}

	public void setPaciente(List <Paciente> paciente) {
		Paciente = paciente;
	}
	public void exibir() {
		System.out.println("====Informacoes da Consulta====");
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}
