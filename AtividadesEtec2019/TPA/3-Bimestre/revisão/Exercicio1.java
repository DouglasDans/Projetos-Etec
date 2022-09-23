import java.util.Scanner;
public class Exercicio1 {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);
		int i=1,e,s=0,o=0;
		System.out.println("Escolha o número secreto de 0 a 100");
		e=ler.nextInt();
		do{
		while(i<=10) {
			System.out.println("Digite o numero para adivinhar o numero secreto");
			s=ler.nextInt();
			if (s>e) {
				System.out.println("o numero escolido é Maior");
			}else {
				System.out.println("o numero escolido é Menor");
			}if (s==e) {
				System.out.println("Acertou na " +i+ "° tentativa");
				i=i+20;
			}
			i++;
		}

			System.out.println("Fim de Jogo - Deseja continuar? 1-Sim 2-Não");
			o=ler.nextInt();
			i=1;
		}while(o==1);
	}
}
