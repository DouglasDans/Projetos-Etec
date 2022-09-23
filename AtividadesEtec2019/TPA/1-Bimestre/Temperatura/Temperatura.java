import java.util.Scanner;
public class Temperatura {
	public static void main(String [] args) {
	double f,c;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite a temperatura em fahrenheit");
	f=leia.nextDouble();
	c=(f-32)*(5/9);
	System.out.println("temperatura em graus celsius "+c);
		
		
		
		
		
	}
}
