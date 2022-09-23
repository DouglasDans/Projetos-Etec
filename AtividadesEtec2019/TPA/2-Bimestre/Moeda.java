import java.util.Scanner;
public class Moeda {
	public static void main(String[]args) {
	double m,d,r,e,p,tmg;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite seu dinheiro");
	m=leia.nextDouble();
	r=m;
	e=m*0.22;
	d=m*0.25;
	p=m*11.66;
	System.out.println("Real=R$"+r+" Para coverter digite 1=Dolar-EUA, 2=Euro-Europa, 3=Peso-Argentina");
	tmg=leia.nextInt();
	if (tmg==1) {
		System.out.println("Dolar=US$"+d);
	}
	if(tmg==2) {
		System.out.println("Euro=EU$"+e);
	}
	if(tmg==3) {
		System.out.println("Peso=ARS$"+p);
	}
	
	
}
}
