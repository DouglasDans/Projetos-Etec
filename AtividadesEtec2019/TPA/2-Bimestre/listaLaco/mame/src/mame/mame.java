package mame;
import java.util.Scanner;
public class mame {
	public static void main (String[]args) {
		int i,id,at,an,ma,me,p1 = 0,p2 = 0;
		Scanner in = new Scanner(System.in);
		i=0;
		id=0;
		ma=0;
		me=0;
		p1=0;
		p2=0;
		while (i<=9) {
			System.out.println("Digite o ano de nascimento");
			an = in.nextInt();
			System.out.println("Digite o ano atual");
			at = in.nextInt();
			id=at-an;
			if (id>=18) {
				System.out.println("Voc� j� � maior de idade, sua idade �: "+id);
				id=ma;
			}else {
				System.out.println("Voc� ainda � menor de idade, sua idade �: "+id);
			}i++;
		}
		me=1-ma;
		p1= (ma*1000)/100;
		System.out.println("S�o "+p1+"% dos usu�rios maiores de idade");
		p2= (me*1000)/100;
		System.out.println("S�o "+p2+"% dos usu�rios menores de idade");
	}
}
