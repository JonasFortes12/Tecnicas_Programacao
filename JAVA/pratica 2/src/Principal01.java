// EXECÍCIO PRÁTICO 01

import java.util.Scanner;

public class Principal01 {

	public static void main(String args[]) {
		
		int X;
		int penultimo = 1;
		int ultimo = 1;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite um numero de 3 a 90: ");
		X = ler.nextInt();
		
		System.out.print(penultimo +" "+ ultimo);
		
		for(int i=3; i<=X; i++) {
			
			int fib = penultimo + ultimo;
			
			System.out.print(" " +fib);
			
			penultimo = ultimo;
			ultimo = fib;
			
			}
	}
}
