import java.util.Scanner;
public class Exercicio4 {
	public static void main (String [] args) {
		double r, a, b, c, x, bha, r1, r2;;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite o valor A de sua equa��o:");
		a= ler.nextDouble();
		System.out.println("Digite o valor B de sua equa��o:");
		b= ler.nextDouble();
		System.out.println("Digite o valor C de sua equa��o:");
		c= ler.nextDouble();
		x= (b*b)-(4*a*b);
		if (x<0) {
			System.out.println("N�o existem ra�zes reais para a equa��o.");
		}
		else if (x==0) {
			r=(-b)/(2*a);
			System.out.println("A �nica ra�z �: "+r);
		}
		else if (x>0) {
			System.out.println("Delta:" +x);
			System.out.println("Existem duas ra�zes:");
			System.out.println("====================");
			r1=(-b+Math.sqrt(x))/(2*a);
			r2=(-b-Math.sqrt(x))/(2*a);
			System.out.println("X�="+r1);
			System.out.println("X�="+r2);
		}
	}
}