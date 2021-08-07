import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void leitor(String path) throws IOException {
		
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while(true) {
			if (linha != null) {
				System.out.println(linha);
			}else break;
				
			linha = buffRead.readLine();
		}
		buffRead.close();
		
	}

	public static void escritor(String path) throws IOException{
		
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva Algo: ");
		
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		
	}

	public static void main(String args[]) throws IOException {
		String path = "X:\\Backup\\Desktop\\FACULDADE\\2º Período\\Técnicas de Programação\\pratica 5\\Arquivo2.txt";
		escritor(path);
		leitor(path);
	
	}
}
