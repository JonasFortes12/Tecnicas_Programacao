
public class Principal {

	public static void main(String[] args) {
		
		int num = 81;
		double x = Math.sqrt(num);
		System.out.println("A raiz quadrada de " + num +" � " + x);
		
		String nome = "Fulano";
		String frase = "Meu nome � ";
		String completa = frase + nome;
		

		System.out.println("Valor absoluto: " + Math.abs(-81.4));
		System.out.println("Seno: " + Math.sin(90.0));
		System.out.println("Seno: " + Math.sin(Math.toRadians(90)));
		System.out.println("Max: " + Math.max(85, 20));
		
//		Fun��es MATH Escolhidas
		System.out.println("Log de 10 na base 10: " + Math.log10(10));
		System.out.println(num + " elevado a 3: " + Math.pow(num, 3));
		System.out.println(num + " Ra�z quadrada de (16^2 + 9^2): " + Math.hypot(16, 9));
		
		System.out.println(completa);
		System.out.println("O tamanho do nome �: " + nome.length());
		System.out.println("O caracter da posicao 2 �: " + nome.charAt(1));
		System.out.println("Frase toda em mai�sculas: " + completa.toUpperCase());
		System.out.println("Trecho de 2 a 8: " + completa.substring(2,8));
		System.out.println("Retira os espa�os antes e depois: "  + frase.trim());
		System.out.println("Substituindo Fulano por Sicrano: " + completa.replace("Fulano", "Sicrano"));
		
//		Fun��es STRING Escolhidas
		System.out.println("Frase toda em min�sculo: " + completa.toLowerCase());
		System.out.println("Index do nome na frase: " + completa.indexOf(nome));
		System.out.println("O nome termina com O : " + nome.endsWith("o"));
		
//		Valores Aleat�rios

		for(int i = 0; i<200; i++) {
			int numero = (int) (5 + (Math.random()*100));
			while(numero>102) numero = (5 + (int) Math.random()*100);
			
			System.out.println("n:"+i+" "+numero);

		}


//		Operador Tern�rio		
		int a;
		int i = 0;
		a = (i == 0) ? 10:5;
		System.out.println("a = " + a);
		
//		Valor M�nimo	
		int k = 13;
		int l = 11;
		int minVal = (k < l) ? k : l; 
		System.out.println("Valor minimo = " + minVal);

//		Valor Absoluto
		int v = -40;
		int absValue = (v < 0) ? -v : v;
		System.out.println("Valor Absoluto = " + absValue);
		
		
		
		
	}
}
