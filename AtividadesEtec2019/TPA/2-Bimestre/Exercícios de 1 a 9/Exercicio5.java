import java.util.Scanner;
public class Exercicio5 {
	public static void main (String[] args) {
		double a, b, c, t, t2, t3;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite o valor A de seu poss�vel tri�ngulo:");
		a=ler.nextDouble();
		System.out.println("Digite o valor B de seu poss�vel tri�ngulo:");
		b=ler.nextDouble();
		System.out.println("Digite o valor C de seu poss�vel tri�ngulo:");
		c=ler.nextDouble();
		t=a+b;
		t2=a+c;
		t3=b+c;
		if (c>t) {
			System.out.println("Este tri�ngulo est� errado");
		}
		else if (b>t2) {
			System.out.println("Este tri�ngulo est� errado");
		}
		else if (a>t3) {
			System.out.println("Este tri�ngulo est� errado");
		}
		else if (a==b && a==c) {
			System.out.println("Tri�ngulo Equil�tero");
		}
		else if (a!=b && a!=c) {
			System.out.println("Tri�ngulo Escaleno");
		}
		else if (a!=c && b==c) {
			System.out.println("Tri�ngulo Is�scele");
		}
		else if (b!=c && a==c) {
			System.out.println("Tri�ngulo Is�scele");
		}
		else if (c!=b && b==a) {
			System.out.println("Tri�ngulo Is�scele");
		}
	}

}