package lista1;
import java.util.Scanner;
	public class Exercicio3 {
	public static void main(String[] args) {
	double m,q;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite quntidade de metros");
	m=leia.nextDouble();
	q=m/1000;
	System.out.println("metros convertidos em quilometros "+q);		
	}
}