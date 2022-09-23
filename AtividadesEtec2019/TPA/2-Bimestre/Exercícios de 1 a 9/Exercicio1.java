import java.util.Scanner;
public class Exercicio1 {
	public static void main (String [] args) {
		int an, at, id;
		Scanner ler= new Scanner (System.in);
		System.out.println ("Digite o ano atual:");
		at=ler.nextInt();
		System.out.println ("Digite seu ano de nascimento");
		an=ler.nextInt();
		id=at-an;
		if (id<10) {
			System.out.println ("Criança");
		}
		else if (id>10 && id<18) {
			System.out.println ("Adolescente");
		}
		else if (id>18 && id<60) {
			System.out.println ("Adulto");
		}
		else if (id>60) {
			System.out.println ("Idoso");
		}
	}
}
