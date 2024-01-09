package sequencial;

import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 */
public class exercicio5 {

	public static void main(String[] args) {
		int codPeca1, qtd1;
		double valorUnit1, Total;
		int codPeca2, qtd2;
		double valorUnit2;
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Digite o codigo da peça 1");
		codPeca1=leia.nextInt();
		
		System.out.println("Digite o codigo da peça 2");
		codPeca2=leia.nextInt();
		
		System.out.println("Digite a quantidade da peça 1");
		qtd1=leia.nextInt();
		
		System.out.println("Digite a quantidade da peça 2");
		qtd2=leia.nextInt();
		
		System.out.println("Digite o valor unitário  da peça 1");
		valorUnit1=leia.nextDouble();
		
		System.out.println("Digite o valor unitário da peça 2");
		valorUnit2=leia.nextDouble();
		
		Total=((qtd1*valorUnit1)+(qtd2*valorUnit2));
	
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", Total);
		
		
		
		
		
		

	}

}
