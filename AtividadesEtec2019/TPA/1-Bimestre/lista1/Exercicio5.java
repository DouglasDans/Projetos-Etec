package lista1;
import java.util.Scanner;
	public class Exercicio5 {
	public static void main(String [] args) {
	double p,d,np;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite um preço");
	p=leia.nextDouble();
	System.out.println("digite desconto");
	d=leia.nextDouble();
	np=p/100*d;
	System.out.println("novo preço "+np);	
	}
}