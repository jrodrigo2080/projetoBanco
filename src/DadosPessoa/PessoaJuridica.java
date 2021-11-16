package DadosPessoa;

import DadosConta.Conta;
import Endereco.Endereco;

public class PessoaJuridica  extends Pessoa{

	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String nome, double renda, int situação, Endereco endereco, Conta conta, String cnpj) {
		super(nome, renda, situação, endereco, conta);
		this.cnpj = cnpj;
	}
	
	
	
}
