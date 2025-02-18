package Banco;

public class ContaCorrente extends Conta implements Transacao {
	private	double limiteChequeEspecial;
	
	public ContaCorrente(String numeroConta, double saldoInicial,double limiteChequeEspecial) {
		super(numeroConta,saldoInicial);
		this.limiteChequeEspecial=limiteChequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		if(saldo+limiteChequeEspecial>=valor) {
			saldo-=valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		}else {
			System.out.println("Saldo Insuficiente.");
		}
	}
	
	@Override
	public void realizarTransacao(double valor) {
		depositar(valor);
	}
}

