package DadosConta;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimento {	
	
	private int tipo;
	private String dataMovimento;
	private String horaMovimento;
	private double valor;
	private Conta conta;
	
	public Movimento(int tipo, String dataMovimento, String horaMovimento, double valor, Conta conta) {
		super();
		this.tipo = tipo;
		this.dataMovimento = dataMovimento;
		this.horaMovimento = horaMovimento;
		this.valor = valor;
		this.conta = conta;
	}
	
	
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDataMovimento() {
		return dataMovimento;
	}
	public void setDataMovimento(String dataMovimento) {
		this.dataMovimento = dataMovimento;
	}
	public String getHoraMovimento() {
		return horaMovimento;
	}
	public void setHoraMovimento(String horaMovimento) {
		this.horaMovimento = horaMovimento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	 	String dataAtualFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
             .format(System.currentTimeMillis());
	 	//Seta valores da data
		String data = dataAtualFormatada.substring(0,10);		
		//Seta valores do horário
		String hora = dataAtualFormatada.substring(11,19);  
	
	public void movimentacao(String tipoPessoa, Movimento movimento, double saldoAtual,double valor) {		
		String tipo="";		
		if(movimento.getTipo() == 1) {
			tipo = "Saque";
		}else if(movimento.getTipo() == 2){
			tipo = "Deposito";
		}else if(movimento.getTipo() == 3) {
			tipo = "Transferencia";
		}
		
		System.out.println("Tipo Pessoa: "+tipoPessoa);
		System.out.println("Tipo da Transação: "+tipo);
		System.out.println("Data: "+ data);
		System.out.println("Hora: "+ hora);
		System.out.println("Saldo atual: "+saldoAtual);
		System.out.println(tipo+" o valor de "+valor);
	}
}
