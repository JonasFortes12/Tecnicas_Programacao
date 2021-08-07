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
    
	
    public int sacar(double valor) {	
	if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return 1;
	}else return 0;
    }

    public int transferir(int conta1, int conta2, double valor) {
        int retorno = 2;
        int nContaComum = Principal.cComun.getNumero();
        int nContaPoupanca = Principal.cPoupanca.getNumero();
        int nContaEspecial = Principal.cEspecial.getNumero();
        
        //Origem Conta Comum 
        if(nContaComum == conta1){
            if(nContaPoupanca == conta2){
                retorno = 0;
                if(valor <= Principal.cComun.getSaldo()){
                    Principal.cComun.setSaldo(Principal.cComun.getSaldo() - valor);
                    Principal.cPoupanca.setSaldo(Principal.cPoupanca.getSaldo() + valor);
                    retorno = 1;
                }
            }else if(nContaEspecial == conta2){
                retorno = 0;
                if(valor <= Principal.cComun.getSaldo()){
                    Principal.cComun.setSaldo(Principal.cComun.getSaldo() - valor);
                    Principal.cEspecial.setSaldo(Principal.cEspecial.getSaldo() + valor);
                    retorno = 1;
                }
            }
            
            
        //Origem Conta Poupança  
        }else if(nContaPoupanca == conta1){
            if(nContaComum == conta2){
                retorno = 0;
                if(valor <= Principal.cPoupanca.getSaldo()){
                    Principal.cPoupanca.setSaldo(Principal.cPoupanca.getSaldo() - valor);
                    Principal.cComun.setSaldo(Principal.cComun.getSaldo() + valor);
                    retorno = 1;
                }
            }else if(nContaEspecial == conta2){
                retorno = 0;
                if(valor <= Principal.cPoupanca.getSaldo()){
                    Principal.cPoupanca.setSaldo(Principal.cPoupanca.getSaldo() - valor);
                    Principal.cEspecial.setSaldo(Principal.cEspecial.getSaldo() + valor);
                    retorno = 1;
                }
            }
        
            
        //Origem Conta Especial    
        }else if(nContaEspecial == conta1){
            if(nContaComum == conta2){
                retorno = 0;
                if(valor <= Principal.cEspecial.getSaldo()){
                    Principal.cEspecial.setSaldo(Principal.cEspecial.getSaldo() - valor);
                    Principal.cComun.setSaldo(Principal.cComun.getSaldo() + valor);
                    retorno = 1;
                }
            }else if(nContaPoupanca == conta2){
                retorno = 0;
                if(valor <= Principal.cEspecial.getSaldo()){
                    Principal.cEspecial.setSaldo(Principal.cEspecial.getSaldo() - valor);
                    Principal.cPoupanca.setSaldo(Principal.cPoupanca.getSaldo() + valor);
                    retorno = 1;
                }
            }
        }
        
        return retorno;    
    }
    
	
    public String tipoConta() {
        return "Conta Comum";
    }

}
