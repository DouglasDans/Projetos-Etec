package lista1;
import java.util.Scanner;
	public class Exercicio1 {
	public static void main(String [] args) {
	int n1,n2,n3,r1,r2,r3,r;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite um numero inteiro");
	n1=leia.nextInt();
	System.out.println("digite outro numero inteiro");
	n2=leia.nextInt();
	System.out.println("digite mais um  numero inteiro");
	n3=leia.nextInt();
	r1=n1*n1;
	r2=n2*n2;
	r3=n3*n3;
	r=r1+r2+r3;
	System.out.println("soma dos três quadrados " +r);
	}
}