package trabalho1;

public class Contas {
	
	
	private String nome;
	private int numero;
	private double saldo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	public void depositar(double valor) {
		
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor; 
		}else {
			System.out.print("Saldo Insuficiente");
		}
	}

	public void transferir(int conta1, int conta2, double valor) {
	
		
	}
	
	public void tipoConta() {
		System.out.println("Conta-Comum");
	}

}
