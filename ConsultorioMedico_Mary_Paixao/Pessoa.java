package ConsultorioMedico_Mary_Paixao;

public class Pessoa {
		//	 atributos
			 private String primeiroNome;
			 private String sobrenome;
			 private int idade;
			 private String CPF;
			 private String  genero;
	// construtor padrao
			public Pessoa () {
			}
	//construtor com parametro
	public Pessoa(String pn, String s, int i, String c, String  g) {
		this.primeiroNome = pn;
		this.sobrenome = s;
		this.idade = i;
		this.CPF = c;
		this.genero = g;
	}
	//getter e setter 
	 public String getPrimeiroNome() {
		return primeiroNome;
	}
	 public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	 public String getSobrenome() {
		return sobrenome;
	}
	 public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	 public int getIdade() {
		return idade;
	}
	 public void setIdade(int idade) {
		this.idade = idade;
	}
	 public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	
}
