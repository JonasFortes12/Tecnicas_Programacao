package trabalho1;

public class ContaPoupanca extends Contas {
    
    private int taxa;
    
    public void reajustar() {
        this.setSaldo(this.getSaldo() + this.getSaldo()*0.10);
    }
	
    public void reajustar(double taxa) {
	this.setSaldo(this.getSaldo() + (this.getSaldo()*(taxa/100)));
    }
	
    public String tipoConta() {
        return "Conta Poupança";
    }

 
    public int getTaxa() {
        return taxa;
    }


    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }
}