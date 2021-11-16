package DadosPessoa;

import DadosConta.Conta;
import Endereco.Endereco;

public class Pessoa {

	private String nome;
	private double renda;
	private int situa��o;
	private Endereco endereco;
	private Conta conta;
	

	public Pessoa(String nome, double renda, int situa��o, Endereco endereco, Conta conta) {
		super();
		this.nome = nome;
		this.renda = renda;
		this.situa��o = situa��o;
		this.endereco = endereco;
		this.conta = conta;
	}
	
	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public int getSitua��o() {
		return situa��o;
	}
	public void setSitua��o(int situa��o) {
		this.situa��o = situa��o;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
