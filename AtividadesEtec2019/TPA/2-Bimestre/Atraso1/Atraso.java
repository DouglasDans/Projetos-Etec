import java.util.Scanner;
public class Atraso {
	public static void main(String[]args) {
	double p,d,tt;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite o valor da prestação");
	p=leia.nextDouble();
	System.out.println("digite os dias atrasados");
	d=leia.nextInt();
	tt=p+(p/100*2)*(0.1*d);
	if(d>44) {
		tt=tt+(tt/100*3);
	System.out.println("Total a pagar R$"+tt);
	}else if(d<44) {
		System.out.println("não tem juros");	
	}
	}
}

