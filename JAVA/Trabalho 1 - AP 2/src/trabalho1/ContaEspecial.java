package trabalho1;

public class ContaEspecial extends Contas {

	int limite;
	double multa;
	
	
	public void descontar(double desconto) {
		this.setSaldo(getSaldo() - desconto);
	}
	
	public void tipoConta() {
		System.out.println("Conta-Especial");
	}
	
	public void sacar(double valor) {
		
		if(valor <= this.getSaldo()) {
			
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque efetuado com sucesso");
			
		}else if (valor > this.getSaldo()) {
			
			double extra = (valor - getSaldo());
			double desconto;
			
			if(extra <= this.limite) {
				
				setSaldo(0);
				this.limite -= extra;
				desconto = extra + (extra*(multa/100));
				
				descontar(desconto);
				System.out.println("Saque efetuado usando cheque especial");
				
			}else System.out.println("Saldo insuficiente");
		}
	}
}




