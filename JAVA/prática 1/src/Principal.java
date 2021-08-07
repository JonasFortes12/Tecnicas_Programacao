
public class Principal {
	public static void main(String args[]) {
		
		Contas c1 = new Contas();
		Contas c2 = new Contas();
		
		c1.numConta = 100001;
		c1.nome = "Fulano";
		c1.saldo = 500;
		
		System.out.println("Nome de c1: " + c1.getNome());
		System.out.println("Numero da Conta: " + c1.getNumConta());
		System.out.println("Saldo de c1: " + c1.saldo);
		
		c1.depositar(80);
		System.out.println("Saldo de c1: " + c1.saldo);
		c1.sacar(30);
		System.out.println("Saldo de c1: " + c1.saldo); 
		
		/*----------------------------------------------------------*/
		
		c2.numConta = 100002;
		c2.nome = "Ciclano";
		c2.saldo = 200;
		
		System.out.println("Nome de c2: " + c2.getNome());
		System.out.println("Numero da Conta: " + c2.getNumConta());
		System.out.println("Saldo de c2: " + c2.saldo);
		
		c2.depositar(100);
		System.out.println("Saldo de c2: " + c2.saldo);
		c2.sacar(40);
		System.out.println("Saldo de c2: " + c2.saldo);
		
	}
}
