import java.util.Scanner;
public class Somar {
	public static void main (String args[]) {
		double n1,n2,r;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um Valor");
		n1=ler.nextDouble ();
		System.out.println("Digite outro valor");
		n2=ler.nextDouble ();
		r=n1+n2;
		System.out.println("A soma ?"+r);
	}
}
