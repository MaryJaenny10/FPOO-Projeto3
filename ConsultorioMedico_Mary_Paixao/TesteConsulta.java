package ConsultorioMedico_Mary_Paixao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TesteConsulta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
		System.out.println("====MEDICO====");
		Medico m1 = new Medico();
		System.out.println("Nome do Medico: ");
		String nome = entrada.next();
		m1.setPrimeiroNome(nome);
		System.out.println("Sobrenome");
		String sobrenome = entrada.next();
		m1.setSobrenome(sobrenome);
		System.out.println("Idade:");
		int idade = entrada.nextInt();
		m1.setIdade(idade);
		System.out.println("CPF:");
		String CPF = entrada.next();
		m1.setCPF(CPF);
		System.out.println("Qual genero se identifica? M ou F");
		String genero4 = entrada.next();
		m1.setGenero(genero4);
		System.out.println("Especializacao: ");
		String especializacao = entrada.next();
		m1.setEspecializacao(especializacao);
		System.out.println("Salario: ");
		double salario = entrada.nextDouble();
		m1.setSalario(salario);
		m1.exibir1();
		
		
		System.out.println("====FUNCIONARIO====");
		Funcionaro f1 = new Funcionaro ();
		System.out.println("Nome do Funcionario: ");
		String nome1 = entrada.next();
		f1.setPrimeiroNome(nome1);
		System.out.println("Sobrenome: ");
		String sobrenome1 = entrada.next();
		f1.setSobrenome(sobrenome1);
		System.out.println("Idade: ");
		int idade1 = entrada.nextInt();
		f1.setIdade(idade1);
		System.out.println("CPF: ");
		String CPF1 = entrada.next();
		f1.setCPF(CPF1);
		System.out.println("Qual genero se identifica? M ou F");
		String genero5 = entrada.next();
		f1.setGenero(genero5);
		System.out.println("Cargo: ");
		String cargo = entrada.next();
		f1.setCargo(cargo);
		System.out.println("Salario: ");
		double salario1 = entrada.nextDouble();
		f1.setSalario(salario1);
		f1.exibir3();
	
		System.out.println("====PRIMEIRO PACIENTE SENDO ATENDIDO====");
		Paciente p1 = new Paciente ();
		Paciente p2 = new Paciente ();
		Paciente p31 = new Paciente ();
		System.out.println("Qual o seu primeiro nome: ");
		String nome2 = entrada.next();
		p1.setPrimeiroNome(nome2);
		System.out.println("Qual o seu sobrenome: ");
		String sobrenome2 = entrada.next();
		p1.setSobrenome(sobrenome2);
		System.out.println("Qual a sua idade: ");
		int idade3 = entrada.nextInt();
		p1.setIdade(idade3);
		System.out.println("Qual o numero do seu CPF: ");
		String CPF3 = entrada.next();
		p1.setCPF(CPF3);
		System.out.println("Qual genero se identifica: M ou F");
		String genero = entrada.next();
		p1.setGenero(genero);
		System.out.println("Qual o seu endereco: ");
		String endereco=entrada.next();
		p1.setEndereco(endereco);
		System.out.println("Qual o numero da casa: ");
		int numeroCasa = entrada.nextInt();
		p1.setNumeroCasa(numeroCasa);
		System.out.println("Qual o seu telefone: ");
		int teleofne = entrada.nextInt();
		p1.setTelefone(teleofne);
		System.out.println("Qual o seu email: ");
		String emial = entrada.next();
		p1.setEmail(emial);
		///****************************
		Atendimento a1 = new Atendimento (emial, null, salario1, salario1, p1);
		System.out.println("Qual o motivo da consulta:  ");
		String motivoConsulta = entrada.next();
		a1.setMotivoConsulta(motivoConsulta);
		LocalDate data = null;
		System.out.println("Qual o melhor dia para voce:  ");
		String data1 = entrada.next();
		data= LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		a1.setData(data);
		
		a1.setHorario(10.50);
		a1.setPreco(1500);
		p1.detalhes();
		a1.exibir5(); 
		System.out.println("====PACIENTE ENTRANDO PARA TER A CONSULTA====");
		
		System.out.println("====SEGUNDO PACIENTE ====");
		System.out.println("Qual o seu primeiro nome: ");
		String nome3 = entrada.next();
		p2.setPrimeiroNome(nome3);
		System.out.println("Qual o seu sobrenome: ");
		String sobrenome3= entrada.next();
		p2.setSobrenome(sobrenome3);
		System.out.println("Qual a sua idade: ");
		int idade4 = entrada.nextInt();
		p2.setIdade(idade4);
		System.out.println("Qual o numero do seu CPF: ");
		String CPF4 = entrada.next();
		p2.setCPF(CPF4);
		System.out.println("Qual genero se identifica? M ou F");
		String genero1 = entrada.next();
		p2.setGenero(genero1);
		System.out.println("Qual o seu endereco: ");
		String endereco1=entrada.next();
		p2.setEndereco(endereco1);
		System.out.println("Qual o numero da casa: ");
		int numeroCasa1 = entrada.nextInt();
		p2.setNumeroCasa(numeroCasa1);
		System.out.println("Qual o seu telefone: ");
		int teleofne1= entrada.nextInt();
		p2.setTelefone(teleofne1);
		System.out.println("Qual o seu email: ");
		String emial1= entrada.next();
		p2.setEmail(emial1);
		//**************************************************************************
		//*************************************************************************
		//*************************************************************************
		Atendimento a2 = new Atendimento (emial1, data, salario1, salario1, p1);
		System.out.println("Qual o motivo da consulta:  ");
		String motivoConsulta1 = entrada.next();
		a2.setMotivoConsulta(motivoConsulta1);
		LocalDate data2 = null;
		System.out.println("Qual o melhor dia para voce:  ");
		String data3 = entrada.next();
		LocalDate data0= LocalDate.parse(data3, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		a2.setData(data0);
		a2.setHorario(10);
		a2.setPreco(500);
		p2.detalhes();
		a2.exibir5(); 
		//****************************************************
		//***************3° PACIENTE **********************
		//***************************************************
		
		System.out.println("====PACIENTE ENTRANDO PARA TER A CONSULTA====");
		
		
		System.out.println("====TERCEIRO  PACIENTE ====");
		System.out.println("Qual o seu primeiro nome: ");
		String nome4 = entrada.next();
		p31.setPrimeiroNome(nome4);
		System.out.println("Qual o seu sobrenome: ");
		String sobrenome4= entrada.next();
		p31.setSobrenome(sobrenome4);
		System.out.println("Qual a sua idade: ");
		int idade5 = entrada.nextInt();
		p31.setIdade(idade5);
		System.out.println("Qual o numero do seu CPF: ");
		String CPF5 = entrada.next();
		p31.setCPF(CPF5);
		System.out.println("Qual genero se identifica? M ou F");
		String genero2 = entrada.next();
		p31.setGenero(genero2);
		System.out.println("Qual o seu endereco: ");
		String endereco2=entrada.next();
		p31.setEndereco(endereco2);
		System.out.println("Qual o numero da casa: ");
		int numeroCasa2 = entrada.nextInt();
		p31.setNumeroCasa(numeroCasa2);
		System.out.println("Qual o seu telefone: ");
		int teleofne2= entrada.nextInt();
		p31.setTelefone(teleofne2);
		System.out.println("Qual o seu email: ");
		String emial2= entrada.next();
		p31.setEmail(emial2);
		Atendimento a3 = new Atendimento (emial2, data2, salario1, salario1, p1);
		System.out.println("Qual o motivo da consulta:  ");
		String motivoConsulta2 = entrada.next();
		a3.setMotivoConsulta(motivoConsulta2);
		LocalDate data4 = null;
		System.out.println("Qual o melhor dia para voce:  ");
		String data41 = entrada.next();
		LocalDate data14= LocalDate.parse(data41, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		a3.setData(data14);
		a3.setHorario(10);
		p31.detalhes();
		a3.exibir5(); 
		System.out.println("====PACIENTE ENTRANDO PARA TER A CONSULTA====");
		
		
		List <Paciente> paciente = new ArrayList <Paciente> ()	;	
		
	paciente.add(  p1);
	paciente.add(  p2);
	paciente.add(  p31);
		System.out.println("====LISTA PACIENTES====");
		for (Paciente pp: paciente ) {
			System.out.println(" Pacientes: " + pp.getPrimeiroNome()  +"\n"   + pp.getSobrenome() +"\n" 
		+ pp.getIdade()  +"\n "   + pp.getCPF() +"\n"+ pp.getEndereco() +"\n "+pp.getNumeroCasa() 
		+ "\n "+pp.getTelefone()+"\n "+pp.getEmail());
		}
	
	
	}

	
	}


