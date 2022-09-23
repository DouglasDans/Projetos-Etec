import java.util.Scanner;
public class ExercicioE {
	public static void main(String[]Args) {
		double i = 0,n;// i = while , n = numero 
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero ");
		n=ler.nextDouble();
		while (i<=n) {
			n=n%2%3%7%11%13%17%19%23%29%31;
			i=i+2;
			if (n > 0) {
				System.out.println("É primo");
			}else {
				System.out.println("não é primo");
			}
			
		}
		
	}	
}
