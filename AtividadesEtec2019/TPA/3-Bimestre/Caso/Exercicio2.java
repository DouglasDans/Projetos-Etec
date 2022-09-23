import java.util.Scanner;
public class Exercicio2 {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);
		int carro;
		System.out.println("digite o final da placa do seu carro");
		carro=ler.nextInt();
		switch(carro){
		case 0:
		{
			System.out.println("Sexta-feira");
			break;
		}
		
		case 1:
		{
			System.out.println("Segunda-feira");
			break;
		}
		case 2:
		{
			System.out.println("Segunda-feira");
			break;
		}
		case 3:
		{
			System.out.println("Terça-feira");
			break;
		}
		case 4:
		{
			System.out.println("Terça-feira");
			break;
		}
		case 5:
		{
			System.out.println("Quarta-feira");
			break;
		}
		case 6:
		{
			System.out.println("Quarta-feira");
			break;
		}
		case 7:
		{
			System.out.println("Quinta-feira");
			break;
		}
		case 8:
		{
			System.out.println("Quinta-feira");
			break;
		}
		case 9:
		{
			System.out.println("Sexta-feira");
			break;
		}
		default:
		{
			System.out.println("dia invalido");
			break;
		}
	}

		
}
}	
