package sequencial;

import java.util.Scanner;

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class exercicio3 {
	public static void main (String args[]) {
		Scanner leia= new Scanner(System.in);
		int A,B,C,D;
		int Diferencia;
		
		System.out.println("Digite o valor da letra A");
		A=leia.nextInt();
		
		System.out.println("Digite o valor da letra B");
		B=leia.nextInt();
		
		System.out.println("Digite o valor da letra C");
		C=leia.nextInt();
		
		System.out.println("Digite o valor da letra D");
		D=leia.nextInt();
		
		Diferencia=((A*B)-(C*D));
		System.out.println("A Diferencia="+Diferencia);
		
		
	}

}
