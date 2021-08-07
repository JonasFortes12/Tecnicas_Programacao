
public class Contas {
	
	int numConta;
	String nome;
	double saldo;
	
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	public String getNome() {
		return nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
}
