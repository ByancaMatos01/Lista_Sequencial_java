package sequencial;

import java.util.Scanner;

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
