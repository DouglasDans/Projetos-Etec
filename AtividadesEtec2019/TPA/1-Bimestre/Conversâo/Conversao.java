import java.util.Scanner;
public class Conversao {
	public static void main (String args[]) {
		double m,a,dia;
		Scanner ler= new Scanner (System.in);
		System.out.println ("Digite um dia");
		dia=ler.nextDouble();
		m=dia/30;
		a=dia/365;
		System.out.println ("Apresente meses= "+m+" Apresente anos "+a);
	}
}
