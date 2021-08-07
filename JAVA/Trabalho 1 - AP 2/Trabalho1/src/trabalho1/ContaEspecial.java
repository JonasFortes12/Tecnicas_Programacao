package trabalho1;


public class ContaEspecial extends Contas {

    private int limite;
    private double multa;
	
    
    public void descontar(double desconto) {
    	this.setSaldo(this.getSaldo() - desconto);
    }
	
    public String tipoConta() {
	return "Conta Especial";
    }
    
    
    public int sacar(double valor) {
	int retorno;
        
    	if(valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            retorno = 1;		

        }else{	
            int extra = (int) (valor - getSaldo());
            double desconto;
			
            if(extra <= this.getLimite()) {	
                this.setSaldo(0);
            
                this.setLimite(this.getLimite() - extra);
                desconto = extra + (extra*(this.getMulta()/100));
				
                this.descontar(desconto);
                retorno = 2;
				
            }else retorno = 0;
            
        }
        return retorno;
    }


    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }


    public double getMulta() {
        return multa;
    }

    
    public void setMulta(double multa) {
        this.multa = multa;
    }
}
