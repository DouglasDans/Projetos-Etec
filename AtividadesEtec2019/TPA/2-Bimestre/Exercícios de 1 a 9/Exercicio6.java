import java.util.Scanner;
public class Exercicio6 {
	public static void main (String[] args) {
		int a, b, c;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite o valor A:");
		a=ler.nextInt();
		System.out.println("Digite o valor B:");
		b=ler.nextInt();
		System.out.println("Digite o valor C:");
		c=ler.nextInt();
		if (a>b && a>c && b>c) {
			System.out.println("A sequ�ncia �: " +c+", "+b+", "+a);
		}
		else if (a>b && a>c && c>a) {
			System.out.println("A sequ�ncia �: " +c+", "+c+", "+a);
		}
		else if (b>a && b>c && a>c) {
			System.out.println("A sequ�ncia �: " +c+", "+a+", "+b);
	}
		else if (b>a && b>c && c>a) {
			System.out.println("A sequ�ncia �: " +a+", "+c+", "+b);
		}
		else if (c>a && c>b && a>b) {
			System.out.println("A sequ�ncia �: " +b+", "+a+", "+c);
		}
		else if (c>a && c>b && b>a) {
			System.out.println("A sequ�ncia �: " +a+", "+b+", "+c);
		}
	}
}
