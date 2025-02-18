package Banco;

public abstract class Conta {
	protected String numeroConta;
	protected double saldo;
	
	public Conta(String numeroConta,double saldoInicial) {
		this.numeroConta=numeroConta;
		this.saldo=saldoInicial;
	}
	
	public abstract void sacar(double valor);
	
	public void depositar(double valor) {
		if (valor >0) {
			saldo += valor;
			System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
		}else {
			System.out.println("Valor de deposito invalido.");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	@Override
	public String toString() {
		return "Conta: " + numeroConta + ", Saldo R$ " + saldo;
	}
	
}
