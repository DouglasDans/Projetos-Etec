import java.util.Scanner;
public class ExercicioB {
	public static void main(String[]Args) {
		int i,h,t=1;
		Scanner ler=new Scanner(System.in);
		i=1;
		System.out.println("Digite o Numero a ser fatorado");
		h=ler.nextInt();
		while (i<=h) {
			t=t*i;
			i++;  
		}
			System.out.println(t);
			
		}
	
		
}
