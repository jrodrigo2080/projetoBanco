package DadosConta;

public class Conta {
	
	private long numero;
	private String dataAbertura;
	private String dataEncerramento;
	private int situacao;
	private String senha;
	private double saldo;
	
	
	public Conta(long numero, String dataAbertura, String dataEncerramento, int situacao, String senha, double saldo) {
		super();
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.dataEncerramento = dataEncerramento;
		this.situacao = situacao;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getDataEncerramento() {
		return dataEncerramento;
	}
	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	
	
	public void sacar(double valor) {		
		double saldoAtual = getSaldo();
		saldoAtual = saldoAtual - valor;
		setSaldo(saldoAtual);
	}
	
	
	public void depositar(double valor) {
		double saldoAtual = getSaldo();
		saldoAtual = saldoAtual + valor;
		setSaldo(saldoAtual);
	}

	
	public void transferir(double valor, Conta conta) {		
		conta.setSaldo(conta.getSaldo() + valor);
		setSaldo(getSaldo() - valor);
	}
	
	

}
