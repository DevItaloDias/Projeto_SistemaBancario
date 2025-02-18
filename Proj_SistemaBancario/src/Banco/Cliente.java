package Banco;

public class Cliente {
	private String nome;
	private Conta[]contas;
	private int totalContas;
	
	public Cliente (String nome,int capacidadeContas) {
		this.nome=nome;
		this.contas=new Conta[capacidadeContas];
		this.totalContas=0;
	}
	
	
	public void adicionarConta(Conta conta) {
		if(totalContas<contas.length) {
			contas[totalContas]=conta;
			totalContas++;
			System.out.println("Conta adicionada com sucesso.");
		}else {
			System.out.println("Capacidade maxima de contas atingida");
		}
	}
	
	public void listarContas() {
		System.out.println("Contas de " + nome + ": ");
		for (int i=0;i<totalContas;i++) {
			System.out.println(contas[i]);
		}
	}
	
	public Conta[]getContas(){
		return contas;
	}
}
