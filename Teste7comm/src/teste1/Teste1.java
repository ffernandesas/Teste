package teste1;

public class Teste1 {
	
	public static void main (String[] args){ 
	
	// elementos inciam em 5, 6, 8, 11, ...
	
	int a = 5;
	int b = 6;
	int c = 8;
	int ultimo = 0;
	int i = 0;
	
	System.out.println("A sequência X é formada da seguinte maneira. Cada termo da sequência é a soma do penúltimo e antipenúltimo número.\r\n"
			+ "\r\n"
			+ "então em uma sequência começando por 5 6 8, os 10 primeiros termos é\r\n"
			+ "\r\n"
			+ "5 6 8 11 14 19 25 33 44 58\r\n"
			+ "\r\n"
			+ "Considerando essa sequência começando por 5 6 e 8, imprima o valor do quinquagésimo termo.\r\r\n");
	
	
		for(i = 4; i <= 50; i++) {
			ultimo = a + b;
			
			// substituição dos termos 
			a = b;
			b = c;
			c = ultimo;
					
		}
	
		System.out.println("O 50º termo é: " + ultimo + ".");
		
	}

}
