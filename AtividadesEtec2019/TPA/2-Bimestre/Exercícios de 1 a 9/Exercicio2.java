import java.util.Scanner;
public class Exercicio2 {
	public static void main (String[] args) {
		double l, d, g;
		Scanner ler= new Scanner (System.in);
		System.out.println ("Digite a dist�ncia em km:");
		d=ler.nextDouble();
		System.out.println ("Digite a capacidade do tanque em litros:");
		l=ler.nextDouble();
		g=d/l;
		if (g>=10) {
			System.out.println("Econ�mico");
		}else {
			System.out.println("N�o econ�mico");
		}
		
	}

}
