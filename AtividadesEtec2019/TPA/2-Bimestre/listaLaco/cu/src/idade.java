
import java.util.Scanner;
public class idade {

	public static void main(String[]args) {
		
		int an,at,id;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o ano de nascimento:");
		an = ler.nextInt();
		System.out.println("Digite o ano atual:");
		at = ler.nextInt();
		id = at-an;
		if(id<10){
			System.out.println("Crian�a");
		}else if(id>=10 && id<18) {
			System.out.println("Adolescente");
		}else if(id>=60) {
			System.out.println("Idoso");
		}else if(id>=18 && id<60) {
			System.out.println("Adulto");
		}
		
	}
	
}