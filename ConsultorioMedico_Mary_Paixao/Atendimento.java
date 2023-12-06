package ConsultorioMedico_Mary_Paixao;

import java.time.LocalDate;
import java.time.LocalTime;


public class Atendimento   {
		private String motivoConsulta;
		private LocalDate data;
		private double preco;
		private  double horario;
		private Paciente paciente;
		
		public Atendimento () {
		}

		public Atendimento (String motivoConsulta ,LocalDate data, double preco, double horario, Paciente p) {
			
			this.data = data;
			this.preco = preco;
			this.horario = horario;
			this.motivoConsulta=motivoConsulta;
			this.paciente=p;
		
		}
		
		public String getMotivoConsulta() {
			return motivoConsulta;
		}
		public void setMotivoConsulta(String motivoConsulta) {
			this.motivoConsulta = motivoConsulta;
		}
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
		public double getPreco() {
			return preco;
		}
		
		public double getHorario() {
			return horario;
		}
		public void setHorario(double horario) {
			this.horario = horario;
		}
		
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		
		public void exibir5 () {
			System.out.println("====Atendimento====");
			System.out.println("Tipo da Consulta: "+ getMotivoConsulta());
			System.out.println("Data: " + getData());
			System.out.println("Horario: " +getHorario());
			System.out.println("Preco Total: " +getPreco());
		}

		public Paciente getPaciente() {
			return paciente;
		}

		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}
		
}
