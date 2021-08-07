import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arquivo {

	public static void main (String args[]) throws IOException {
		
		Scanner read = new Scanner(System.in);
		int i, n;
		
		System.out.print("Informe o numero para a tabuada: ");
		n = read.nextInt();
		
		FileWriter arq = new FileWriter("X:\\Backup\\Desktop\\FACULDADE\\2º Período\\Técnicas de Programação\\pratica 5\\Tabuada.txt", true);
		PrintWriter saveArq = new PrintWriter(arq);
		
		saveArq.printf("_____Resultado______%n");
		for (i=1; i<=10; i++) saveArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
		saveArq.printf("________________________%n");
		
		arq.close();
		
		System.out.printf("\nTabuada do %d foi gravada com sucesso", n);
		
	}
	
}
