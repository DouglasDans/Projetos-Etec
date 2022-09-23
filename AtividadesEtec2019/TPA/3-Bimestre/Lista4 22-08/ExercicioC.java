import java.util.Scanner;
public class ExercicioC {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);
		int mb=0,b=0,r=0,i=0,n=0,a=0,c=0,p1=0,p2=0,p3=0,p4=0;
		System.out.println("Informe a quantidade de alunos");
		a=ler.nextInt();
		while (c<a) {
		

		System.out.println("Digite a menção, MB=1, B=2, R=3, I=4");
		n=ler.nextInt();
		if(n==1) {
			mb++;
		}else if (n==2){
			b++;
		}else if (n==3) {
			r++;
		}else if (n==4) {
			i++;
		}
		c++;
	}
	p1=(mb*100)/a;
	System.out.println(p1+"% dos alunos tem MB");
	p2=(b*100)/a;
	System.out.println(p2+"% dos alunos tem B");
	p3=(r*100)/a;
	System.out.println(p3+"% dos alunos tem R");
	p4=(i*100)/a;
	System.out.println(p4+"% dos alunos tem I");
}
}
