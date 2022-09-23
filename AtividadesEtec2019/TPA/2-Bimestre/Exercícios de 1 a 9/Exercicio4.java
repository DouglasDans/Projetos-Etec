import java.util.Scanner;
public class Exercicio4 {
	public static void main (String [] args) {
		double r, a, b, c, x, bha, r1, r2;;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite o valor A de sua equação:");
		a= ler.nextDouble();
		System.out.println("Digite o valor B de sua equação:");
		b= ler.nextDouble();
		System.out.println("Digite o valor C de sua equação:");
		c= ler.nextDouble();
		x= (b*b)-(4*a*b);
		if (x<0) {
			System.out.println("Não existem raízes reais para a equação.");
		}
		else if (x==0) {
			r=(-b)/(2*a);
			System.out.println("A única raíz é: "+r);
		}
		else if (x>0) {
			System.out.println("Delta:" +x);
			System.out.println("Existem duas raízes:");
			System.out.println("====================");
			r1=(-b+Math.sqrt(x))/(2*a);
			r2=(-b-Math.sqrt(x))/(2*a);
			System.out.println("X¹="+r1);
			System.out.println("X²="+r2);
		}
	}
}