package lista1;
import java.util.Scanner;
	public class Exercicio4 {
	public static void main(String []args) {
	double vc,ipva;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite valor do carro");
	vc=leia.nextDouble();
	ipva=vc*4/100;
	System.out.println("ipva "+ipva);		
	}
}
