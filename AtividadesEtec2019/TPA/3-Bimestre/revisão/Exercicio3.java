import java.math.*;
import java.util.Scanner;
public class Exercicio3 {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);
		double a,pb,ps,pr,qgb=100,kb,ptb,lr,qr,xr,ptr,qs,cs,xs,pts,smt,xb;
		System.out.println("Digite o total de alunos na festa");
		a=ler.nextDouble();
		System.out.println("qual é o preço do bolo");
		pb=ler.nextDouble();
		System.out.println("qual é o preço do refrigerante");
		pr=ler.nextDouble();
		System.out.println("qual é o preço do salgado");
		ps=ler.nextDouble();
		qgb=100*a;
		kb=qgb/1000;
		xb=Math.ceil (kb);
		ptb=xb*pb;
		System.out.println("Quantidade de bolo para a festa: "+xb);
		System.out.println("Preço gasto no bolo: "+ptb);
		lr=600*a;
		qr=lr/2000;
		xr=Math.ceil (qr);
		ptr=xr*pr;
		System.out.println("Quantidade de refrigerante para a festa: "+xr);
		System.out.println("Preço gasto no refrigerante: "+ptr);
		qs=12*a;
		cs=qs/100;
		xs=Math.ceil(cs);
		pts=xs*ps;
		System.out.println("Quantidade de salgados para a festa: "+xs);
		System.out.println("Preço gasto nos salgados: "+pts);
		smt=pts+ptr+ptb;
		System.out.println("Gasto total na festa: "+smt);
		
		
	}
}
