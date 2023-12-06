package ConsultorioMedico_Mary_Paixao;

public class Medico extends Pessoa  {
	private double salario;
	private String especializacao;
	
	public Medico () {
	}

	public Medico(double salario, String especializacao) {
		super();
		this.salario = salario;
		this.especializacao = especializacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public void exibir1 () {
		System.out.println("====Informacao do medico " );
		System.out.println("Nome: "+ getPrimeiroNome()); 
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade : "+getIdade()); 
		System.out.println("CPF: " +getCPF());
		System.out.println("Especializacao: " + getEspecializacao());
		System.out.println("Salario: " +getSalario() );
	}

}
