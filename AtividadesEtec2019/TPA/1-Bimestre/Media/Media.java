import java.util.Scanner;
public class Media {
	public static void main(String [] args) {
	int n1,n2,n3,n4,m;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite nota 1");
	n1=leia.nextInt();
	System.out.println("digite nota 2");
	n2=leia.nextInt();
	System.out.println("digite nota 3");
	n3=leia.nextInt();
	System.out.println("digite nota 4");
	n4=leia.nextInt();
	m=(n1+n2+n3+n4)/4;
	System.out.println("media aritmédica "+m);
		
		
		
	}
}
