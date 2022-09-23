import java.util.Scanner;
public class ExercicioA {
	public static void main(String[]Args) {
		double j,p;
		int i;
		Scanner ler=new Scanner(System.in);
		i=0;
		p=1.45;
		j=1.34;
		while (i<23) {
			p=p+0.02;
			j=j+0.025;
			i++;
			System.out.println("pedro = "+p+"	João = "+j+"	 Foram "+i+" Anos");
		}
		
	}
}
