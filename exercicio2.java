package sequencial;

import java.util.Scanner;

public class exercicio2 {
public static void main(String args []) {
	Scanner leia=new Scanner(System.in);
	double pi,raio,area;
	pi=3.14159;
	System.out.println("Digite o raio");
	raio=leia.nextDouble();
	area=pi*(raio*raio);
	System.out.println("Area= "+area);
}
}
