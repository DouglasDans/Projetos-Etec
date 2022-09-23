import java.util.Scanner;
public class Exercicio2 {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);
		int a,t,l,i=1,nl,ls=1,ar,pr;
		System.out.println("Digite o total de alunos na sala");
		t=ler.nextInt();
		while (i<t) {
			l=40*3;
			System.out.println("o total de lanche é: "+l);
			a=l=3;
			System.out.println("total de lanche para cada aluno: "+a);
			System.out.println("Digite quantos alunos não querem lanche: ");
			ls=ler.nextInt();
			ls=3*ls;
			System.out.println("quantos lanches sobraram: "+ls);
			System.out.println("Digite quantos alunos querem repetir o lanche");
			ar=ler.nextInt();
			pr=ls/ar;
			System.out.println("O total de lanche que o aluno poderá receber é: "+pr);
			pr=ler.nextInt();
			pr=ls/ar;
		}
	}
}
