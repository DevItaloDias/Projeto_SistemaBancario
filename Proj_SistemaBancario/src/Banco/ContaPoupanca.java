package Banco;

public class ContaPoupanca extends Conta{
	private double taxaRendimento;
	
	public ContaPoupanca(String numeroConta,double saldoInicial, double taxaRendimento) {
		super(numeroConta,saldoInicial);
		this.taxaRendimento=taxaRendimento;
	}
	
	@Override
	public void sacar(double valor) {
		if(saldo>=valor) {
			saldo-=valor;
			System.out.println("Saque de R$ " + valor + " realizada com sucesso.");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void aplicarRendimento() {
		saldo+=saldo+taxaRendimento;
		System.out.println("Rendimento aplicado. Novo saldo: R$ "+ saldo);
	}
}
