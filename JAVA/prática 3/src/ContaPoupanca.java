
public class ContaPoupanca extends Contas {

	public void reajustar() {
		double saldoAtual = this.getSaldo();
		double reajuste = saldoAtual * 0.1;
		this.depositar(reajuste);
	}
	
	public void reajustar(double taxa) {
		
		double saldoAtual = this.getSaldo();
		double reajuste = saldoAtual * (taxa/100);
		this.depositar(reajuste);
	}
	
	public void tipoConta(){
        System.out.println("Tipo de conta: Comum");
    }
	
}
