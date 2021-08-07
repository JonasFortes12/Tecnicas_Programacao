//  EXECÍCIO PRÁTICO 02

import java.util.Scanner;

public class Principal02 {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); 
		
		Carros obj1 = new Carros();
		Carros obj2 = new Carros();
		
		
		System.out.println("__________Obj1______________");
		
		System.out.print("Informe a Marca:");
		obj1.setMarca(input.next()); 
		
		System.out.print("Informe o Modelo: ");
		obj1.setModelo(input.next());
		
		System.out.print("Informe o Ano: ");
		obj1.setAno(input.nextInt());
		
		System.out.print("Informe as Portas: ");
		obj1.setPortas(input.nextInt());
		
		System.out.print("Informe o Preco: ");
		obj1.setPreco(input.nextDouble());
		
		System.out.println("__________Obj2______________");
		
		System.out.print("Informe a Marca:");
		obj2.setMarca(input.next()); 
		
		System.out.print("Informe o Modelo: ");
		obj2.setModelo(input.next());
		
		System.out.print("Informe o Ano: ");
		obj2.setAno(input.nextInt());
		
		System.out.print("Informe as Portas: ");
		obj2.setPortas(input.nextInt());
		
		System.out.print("Informe o Preco: ");
		obj2.setPreco(input.nextDouble());
		
		System.out.println("__________Informacoes Obj1______________");
		
		System.out.println("Marca: " + obj1.getMarca());
		System.out.println("Modelo: " + obj1.getModelo());
		System.out.println("Ano: " + obj1.getAno());
		System.out.println("Portas: " + obj1.getPortas());
		System.out.println("Preco: " + obj1.getPreco());
		
		System.out.println("__________Informacoes Obj2______________");
		
		System.out.println("Marca: " + obj2.getMarca());
		System.out.println("Modelo: " + obj2.getModelo());
		System.out.println("Ano: " + obj2.getAno());
		System.out.println("Portas: " + obj2.getPortas());
		System.out.println("Preco: " + obj2.getPreco());
		
		System.out.println("___________________________________________");
		
		System.out.print("Porcentagem Desconto Obj1: ");
		System.out.println("Preco com desconto:" + obj1.verDesconto(input.nextDouble()));
		
		System.out.print("Porcentagem Desconto Obj2: ");
		System.out.println("Preco com Desconto:" + obj2.verDesconto(input.nextDouble()));
	}
}