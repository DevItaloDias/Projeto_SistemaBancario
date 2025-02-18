package Banco;

import java.util.Scanner;

public class Banco {
	Scanner sc=new Scanner(System.in);
	
	private void realizarDeposito(Cliente cliente,String numeroConta,double valor) {
		for (Conta conta:cliente.getContas()) {
			if (conta!=null && conta.getNumeroConta().equals(numeroConta)) {
				conta.depositar(valor);
				return;
			}
		}
		
		System.out.println("Conta nao encontrada.");
	}
	
	private void realizarSaque(Cliente cliente, String numeroConta, double valor) {
		for(Conta conta:cliente.getContas()) {
			if(conta!=null && conta.getNumeroConta().equals(numeroConta)) {
				conta.sacar(valor);
				return;
			}
		}
		System.out.println("Conta nao encontrada.");
	}

	
	
	public void exe() {
		System.out.println("---Bem Vindo ao Sistema Bancario---");
		System.out.println("Digite o nome do cliente: ");
		String nomeCliente=sc.nextLine();
		Cliente cliente = new Cliente(nomeCliente,5);
		
		boolean executando=true;
		
		while(executando) {
			String menu="""
					---MENU---
				1.Adicionar Conta Corrente
				2.Adicionar Conta Poupanca
				3.Realizar Deposito
				4.Realizar Saque
				5.Listar Contas
				6.Sair
			Escolha uma opcao(Digite o numero correspondente):
					""";
			
			System.out.println(menu);
			int opcao=sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					
					System.out.println("Insira o numero da conta: ");
					String numContaCC=sc.nextLine();
					System.out.println("Insira o saldo inicial: ");
					double saldoIniCC=sc.nextDouble();
					System.out.println("Insira o limite do cheque especial: ");
					double limiteChequeEsp=sc.nextDouble();
				
					ContaCorrente cc=new ContaCorrente(numContaCC,saldoIniCC,limiteChequeEsp);
					cliente.adicionarConta(cc);
					break;
				case 2:
					System.out.println("Insira o numero da conta: ");
					String numContaCP=sc.nextLine();
					System.out.println("Insira o saldo inicial: ");
					double saldoIniCP=sc.nextDouble();
					System.out.println("Insira a taxa de rendimento(ex: 0,02 para 2%): ");
					double taxaRendimento=sc.nextDouble();
					
					ContaPoupanca cp=new ContaPoupanca(numContaCP,saldoIniCP,taxaRendimento);
					cliente.adicionarConta(cp);
					break;
				case 3:
					System.out.println("Insira o numero da conta para deposito: ");
					String numContaDep=sc.nextLine();
					System.out.println("Insira o valor de deposito: ");
					double valorDep=sc.nextDouble();
					
					realizarDeposito(cliente,numContaDep,valorDep);
					break;
				case 4:
					System.out.println("Insira o numero da conta para saque: ");
					String numContaSaque=sc.nextLine();
					System.out.println("Digite o valor do saque: ");
					double valorSaque=sc.nextDouble();
					
					realizarSaque(cliente,numContaSaque,valorSaque);
					break;
				case 5:
					cliente.listarContas();
					break;
				case 6:
					executando=false;
					System.out.println("Encerrando o Sistema.");
					break;
				default:
					System.out.println("Opcao Errada. Tente Novamente.");
					break;
				
			}
		}
		sc.close();
	}
	
	
}
