package ConsultorioMedico_Mary_Paixao;

public class Funcionaro extends Pessoa {
 
	private double salario;
	private String cargo;
	
	public Funcionaro () {
		
	}

	public Funcionaro(double salario, String cargo) {
		super();
		this.salario = salario;
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void exibir3 () {
		System.out.println("====Informacao do Funcionario====  " );
		System.out.println("Nome: "+ getPrimeiroNome()); 
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade : "+getIdade()); 
		System.out.println("CPF: " +getCPF());
		System.out.println("Cargo: " +getCargo());
		System.out.println("Salario: " +getSalario() );
	}
}
