package DadosPessoa;

import DadosConta.Conta;
import Endereco.Endereco;

public class PessoaFisica extends Pessoa {

	
	
	public PessoaFisica(String nome, double renda, int situação, Endereco endereco, Conta conta, String cpf, String rg) {
		super(nome, renda, situação, endereco, conta);
		this.cpf = cpf;
		this.rg = rg;
	}

	private String cpf;
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	private String rg;
	
}
