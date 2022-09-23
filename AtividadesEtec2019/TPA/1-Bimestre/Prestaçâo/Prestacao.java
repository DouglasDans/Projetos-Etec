import java.util.Scanner;
public class Prestacao {
	public static void main(String [] args) {
	int t,v,td,p;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite a taxa de juros");
	t=leia.nextInt();
	System.out.println("digite o valor original da prestaçâo");
	v=leia.nextInt();
	System.out.println("digite o tempo de dias");
	td=leia.nextInt();
	p=v+(v*t/100)*td;
	System.out.println("prestaçâo "+p);
		
		
		
		
	}
}
