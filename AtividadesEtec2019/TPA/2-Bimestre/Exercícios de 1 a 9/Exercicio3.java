import java.util.Scanner;
public class Exercicio3 {
	public static void main (String[] args) {
		double p, a, i;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite seu peso em kg:");
		p=ler.nextDouble();
		System.out.println("Digite sua altura em metros:");
		a=ler.nextDouble();
		i=p/(a*a);
		if (i<18.5) {
			System.out.println("Seu imc é: "+i+", e você tem Excesso de Magreza");
		}
		else if (i>=18.5 && i<25) {
			System.out.println("Seu imc é: "+i+", e você tem Peso Normal");
		}
		else if (i>=25 && i<30) {
			System.out.println("Seu imc é: "+i+", e você tem Excesso de Peso");
		}
		else if (i>=30 && i<35) {
			System.out.println("Seu imc é: "+i+", e você tem Obesidade (Grau I)");
		}
		else if (i>=35 && i<40) {
			System.out.println("Seu imc é: "+i+", e você tem Obesidade (Grau II)");
		}
		else if (i>=40) {
			System.out.println("Seu imc é: "+i+", e você tem Obesidade (Grau III)");
		}
	}

}
