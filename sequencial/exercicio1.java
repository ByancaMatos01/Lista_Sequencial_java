package sequencial;

import java.util.Scanner;
/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */

/*
 * Descricão num1= numero1, num2= numero2, result= resultado
 */
public class exercicio1 {
public static void main(String args[]) {
	Scanner leia=new Scanner(System.in);
	int num1,num2,result;
	System.out.println("Digite o valor do primeiro número");
	num1=leia.nextInt();
	System.out.println("Digite o valor do segundo número");
	num2=leia.nextInt();
	result=num1+num2;
	System.out.println("A soma= "+result);
	
}
}
