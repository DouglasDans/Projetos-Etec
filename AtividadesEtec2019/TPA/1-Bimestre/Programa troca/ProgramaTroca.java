import java.util.Scanner;
public class ProgramaTroca {
	public static void main(String args[]) {
	int a,b,c;
	Scanner ler= new Scanner (System.in);
	System.out.println ("digite um valor");
	a=ler.nextInt();
	System.out.println ("digite outro valor");
	b=ler.nextInt();
	System.out.println ("Digite mais um valor");
	c=ler.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println ("Apresente"+a+b);
	}
}
