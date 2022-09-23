import java.util.Scanner;
public class Exercicio8 {
	public static void main (String[] args) {
		int n1, n2, m2=0, m, e;
		Scanner ler= new Scanner (System.in);
		System.out.println ("Digite a 1ª nota:");
		n1= ler.nextInt();
		System.out.println("Digite a 2ª nota:");
		n2= ler.nextInt();
		m=n1+n2/2;
		if (m<3) {
			System.out.println("O aluno está REPROVADO!");
		}
		else if (m>5) {
			System.out.println("O aluno está APROVADO!");
		}
		else if (m>2 && m<6) {
			System.out.println("O aluno está em EXAME!");
			System.out.println("Digite a nota do exame:");
			e=ler.nextInt();
			m2=(e+m)/2;
		}
		else if (m2>5) {
			System.out.println("O aluno está APROVADO!");
		}
		else if (m2<6){
			System.out.println("O aluno está REPROVADO!");
		}
	}

}
