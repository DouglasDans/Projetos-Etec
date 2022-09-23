package lista1;
import java.util.Scanner;
public class Banco {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		double e,m,o,x,z;
		System.out.println("Digite o empréstimo");
		e=ler.nextDouble();
		System.out.println("Digite os meses atrasados");
		m=ler.nextDouble();
		x=3*2.5/100;//porcentagem
		o=m*x;
		z=e+o;
		System.out.println("Terá que pagar: "+z);
	}
}
