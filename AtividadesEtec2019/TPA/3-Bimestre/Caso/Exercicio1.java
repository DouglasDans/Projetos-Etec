import java.util.Scanner;
public class Exercicio1 {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);
		int aluno,o;
		do {
		System.out.println("Digite a idade do aluno");
		aluno=ler.nextInt();
		switch(aluno){
			case 6:
			{
				System.out.println("Dente de leite");
				break;
			}
			case 7:
			{
				System.out.println("Junior");
				break;
			}
			case 8:
			{
				System.out.println("Junior max");
				break;
			}
			case 9:
			{
				System.out.println("Junior master");
				break;
			}
			case 10:
			{
				System.out.println("Master");
				break;
			}
			default:
			{
				System.out.println("dia invalido");
				break;
			}
		}
		System.out.println("desja continuar 1-sim 2-não");
		o=ler.nextInt();
		}while(o==1);
	}
}
