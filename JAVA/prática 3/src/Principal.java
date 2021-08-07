
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String args[]) {
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(1000);
		cp.reajustar(20);
		cp.sacar(500);
		System.out.print("Saldo conta poup: " + cp.getSaldo());
	
		Contas c = new Contas();
		
		c.tipoConta();
		cp.tipoConta();
		
		String name = JOptionPane.showInputDialog("Digite seu nome");
		JOptionPane.showMessageDialog(null, "Bem Vindo " + name);
		
		
		
	}
}
