import java.util.Scanner;
public class Exercicio5 {
	public static void main (String[] args) {
		double a, b, c, t, t2, t3;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite o valor A de seu possível triângulo:");
		a=ler.nextDouble();
		System.out.println("Digite o valor B de seu possível triângulo:");
		b=ler.nextDouble();
		System.out.println("Digite o valor C de seu possível triângulo:");
		c=ler.nextDouble();
		t=a+b;
		t2=a+c;
		t3=b+c;
		if (c>t) {
			System.out.println("Este triângulo está errado");
		}
		else if (b>t2) {
			System.out.println("Este triângulo está errado");
		}
		else if (a>t3) {
			System.out.println("Este triângulo está errado");
		}
		else if (a==b && a==c) {
			System.out.println("Triângulo Equilátero");
		}
		else if (a!=b && a!=c) {
			System.out.println("Triângulo Escaleno");
		}
		else if (a!=c && b==c) {
			System.out.println("Triângulo Isóscele");
		}
		else if (b!=c && a==c) {
			System.out.println("Triângulo Isóscele");
		}
		else if (c!=b && b==a) {
			System.out.println("Triângulo Isóscele");
		}
	}

}