import java.util.Scanner;
public class Taxi {
	public static void main(String[]args) {
	double b1,b2,km1,km2,bg,tt,tt0 = 0,tt1,tt2,n,m;
	int hr;
	b1=4.50;
	b2=5.65;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite quantos quilometros serão rodados");
	m=leia.nextInt();
	km1=2.75*m;
	km2=3.58*m;

	System.out.println("digite a hora atual (formato 24h)");
	hr=leia.nextInt();
	if(hr>5&&hr<21){
		tt1=b1+km1;
	}else if(hr>6&&hr<0){
		tt1=b2+km2;
		}else {
			tt1=b1+km1;
		}
	System.out.println("digite o numero de bagagens (Se nenhuma, digite 0)");
	n=leia.nextInt();
	if(n==0) {
		System.out.println("Total a pagar: R$"+tt1);
	}else {
		bg=2.75*n;
		tt0=bg;
	}
	if(tt0>0) {
		tt=tt1+tt0;
		System.out.println("Total a pagar: R$"+tt);
	}
}
}
