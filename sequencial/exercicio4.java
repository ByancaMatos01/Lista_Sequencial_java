package sequencial;

import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */
public class exercicio4 {
public static void main(String[] args) {
	int number;
	double nHoras, salary,valorHora;
	Scanner leia=new Scanner(System.in);
	
	System.out.println("Digite o numero do funcionário");
	number=leia.nextInt();
	
	System.out.println("Digite o número de horas trabalhadas");
	nHoras=leia.nextDouble();
	
	System.out.println("Digite o valor que funcionario recebe por horas ");
	valorHora=leia.nextDouble();
	
	salary=(nHoras*valorHora);
	
	System.out.println("Numero do funcionário é "+ number);
	System.out.println("O salário do funcionário é "+ salary);
}
}
