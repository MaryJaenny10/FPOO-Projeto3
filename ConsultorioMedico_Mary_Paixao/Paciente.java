package ConsultorioMedico_Mary_Paixao;

public class Paciente extends Pessoa {
	// atributos 
		private String endereco;
		private int telefone;
		private int numeroCasa;
		private String email;
	//construtor padro
		public Paciente () {
		}
	//construtor com parametro
		public Paciente(String endereco, int telefone, String email, int numeroCasa) {
			this.endereco = endereco;
			this.telefone = telefone;
			this.email = email;
			this.numeroCasa = numeroCasa;
		}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public void detalhes () {
		System.out.println("====Iformacoes do Paciente====");
		System.out.println("Nome: "+ getPrimeiroNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade : "+getIdade()); 
		System.out.println("CPF: " +getCPF());
		System.out.println("Genero: " +getGenero());
		System.out.println("Endereco: " + getEndereco());
		System.out.println("Numero da Casa: " + getNumeroCasa());
		System.out.println("Telefone: "+ getTelefone());
		System.out.println("Email: " + getEmail());
		
	}

 
}
