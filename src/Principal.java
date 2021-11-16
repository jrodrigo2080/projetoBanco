import java.util.Scanner;

import DadosConta.Conta;
import DadosConta.Movimento;
import DadosPessoa.Pessoa;
import DadosPessoa.PessoaFisica;
import DadosPessoa.PessoaJuridica;
import Endereco.Endereco;

public class Principal {

	public static void main(String[] args) {
		
		//Enderecos
		Endereco enderecoFisica = new Endereco("RUA 1","58000-001","BAIRRO 1",1,"CIDADE 1");
		Endereco enderecoJuridica = new Endereco("RUA 2","58000-002","BAIRRO 2",2,"CIDADE 2");
		
		//Contas
		Conta contaFisica = new Conta(001,"10/02/2021","10/12/2021",1,"123",4000);
		Conta contaJuridica = new Conta(002,"01/02/2021","31/12/2021",1,"123",3000);
		
		
		//Pessoa Fisica e Juridica
		PessoaFisica pessoaFisica = new PessoaFisica("Joao", 2000, 1, enderecoFisica, contaFisica, "000.000.000-01", "00000-001");
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Maria", 2500, 1, enderecoJuridica, contaJuridica, "00.000.000/0001-01");		
		
		
		//transações pessoa fisica
		System.out.println("** Pessoa Fisica ***");
		System.out.println("Saldo atual de "+pessoaFisica.getConta().getSaldo());	
		contaFisica.depositar(500);
		System.out.println("Deposito de 500 reais realizado com sucesso, novo saldo de "+ pessoaFisica.getConta().getSaldo());
		contaFisica.depositar(500);
		System.out.println("Deposito de 500 reais realizado com sucesso, novo saldo de "+ pessoaFisica.getConta().getSaldo());
		contaFisica.sacar(200);
		System.out.println("Saque de 200 reais realizado com sucesso, novo saldo de "+ pessoaFisica.getConta().getSaldo());
		contaFisica.sacar(200);
		System.out.println("Saque de 200 reais realizado com sucesso, novo saldo de "+ pessoaFisica.getConta().getSaldo());
		System.out.println("** Saldo atual de "+pessoaFisica.getConta().getSaldo()+" **");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("  ");
		//transações pessoa juridica
		System.out.println("** Pessoa Juridica **");
		System.out.println("Saldo atual de "+pessoaJuridica.getConta().getSaldo());
		contaJuridica.depositar(1000);
		System.out.println("Deposito de 1000 reais realizado com sucesso, novo saldo de "+ pessoaJuridica.getConta().getSaldo());
		contaJuridica.transferir(500,contaFisica);
		System.out.println("Transferencia de 500 reais realizado com sucesso, novo saldo de "+ pessoaJuridica.getConta().getSaldo());
		contaJuridica.transferir(500,contaFisica);
		System.out.println("Deposito de 500 reais realizado com sucesso, novo saldo de "+ pessoaJuridica.getConta().getSaldo());
		System.out.println("Saldo atual de "+pessoaJuridica.getConta().getSaldo());
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("  ");
		System.out.println("** Novos valores **");
		System.out.println("Pessoa fisica "+pessoaFisica.getConta().getSaldo() );
		System.out.println("Pessoa Juridica "+pessoaJuridica.getConta().getSaldo());
					
	}	
}