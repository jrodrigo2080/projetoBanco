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

	public PessoaJuridica(String nome, double renda, int situa��o, Endereco endereco, Conta conta, String cnpj) {
		super(nome, renda, situa��o, endereco, conta);
		this.cnpj = cnpj;
	}
	
	
	
}
