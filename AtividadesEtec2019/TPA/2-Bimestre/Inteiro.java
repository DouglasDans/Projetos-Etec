import java.util.Scanner;
public class Inteiro {
	public static void main(String [] args) {
	int ni,pr;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite um numero inteiro");
	ni=leia.nextInt();
	pr=ni%2;
	if(pr==0) {
		System.out.println("esse numero é par");
	} else {
		System.out.println("esse numero é impar");
	}
	}
}
