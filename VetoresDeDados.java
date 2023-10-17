package vetores;

import java.util.Scanner;

public class VetoresDeDados {

	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
		
		System.out.print("Entrar com alturas: ");
		
		int num = cs.nextInt();
		double[] alturas = new double[num];
	    for(int i = 0; i < num; i++) {
	    	alturas[i] = cs.nextDouble();
	    }
		
	    double soma = 0;
	    for(int i = 0; i < num; i++) {
	    	soma += alturas[i];
	    }
		
	    System.out.println("Soma: " + soma);
		cs.close();

	}

}
