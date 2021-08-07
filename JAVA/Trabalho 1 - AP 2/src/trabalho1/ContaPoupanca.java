package trabalho1;

public class ContaPoupanca extends Contas {

	public void reajustar() {
		this.setSaldo(this.getSaldo() + this.getSaldo()*0.10);
	}
	
	public void reajustar(double taxa) {
		this.setSaldo(this.getSaldo() + this.getSaldo()*(taxa/100));
	}
	
	public void tipoConta() {
		System.out.println("Conta-Poupança");
	}
}
