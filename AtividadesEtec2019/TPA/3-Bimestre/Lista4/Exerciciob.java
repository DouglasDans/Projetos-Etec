import java.util.Scanner;
public class Exerciciob {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);
		int t=1,i,media=0,i2,n1 = 0,n2 = 0,a=0;
		do {
		for (i=1 ; i<=10 ; i++) {
			System.out.println("Aluno: "+i+"   Turma: "+t+"   Digite sua priemira nota");
			n1=ler.nextInt();
			System.out.println("Aluno: "+i+"   Digite sua segunda nota");
			n2=ler.nextInt();
			media=(n1*n2)/6;			
			if (media>=7) {
			System.out.println("aprovado");
			}
			else {
			System.out.println("reprovado");
			}

		}
		
		t++;
		}while(t<=5);	
		
		
		
		
	}
}
