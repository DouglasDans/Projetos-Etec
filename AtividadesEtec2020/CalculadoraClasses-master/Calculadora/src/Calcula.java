import java.util.Scanner;

public class Calcula {

	double num1;
	double num2;

	public void SolicitarNumero() {
		Scanner ler= new Scanner(System.in);
		double n1,n2;
		System.out.println("Digite um número");
		n1 = ler.nextDouble();
		System.out.println("digite o segundo número");
		n2 = ler.nextDouble();
		
		num1 = n1;
		num2 = n2;
		EscolhaOperacao();
	}
	
	public void EscolhaOperacao(){
		Scanner ler= new Scanner(System.in);
		System.out.println("Qual vai ser a operação?");
		System.out.println("1 = Adição");
		System.out.println("2 = Subtração");
		System.out.println("3 = Multiplicacao");
		System.out.println("4 = Divisao");
		System.out.println("5 = Finalizar Programa");
		int m;
		m = ler.nextInt();
		switch(m) {
			case 1:
				Somar();
			case 2:
				Subtrair();
			case 3:
				Multiplicar();
			case 4:
				Dividir();
			case 5:
				System.exit(0);
		}	
	}
	

	public void Somar() {
		double r;
		r = num1 + num2;
		System.out.println("a soma é:"+r);
		SolicitarNumero();
	}
	
	public void Subtrair () {
		
		double r;
		r = num1 - num2;
		System.out.println("a subtração é:"+r);
		SolicitarNumero();
	}
	
	public void Multiplicar() {
	
	double r;
		r = num1 * num2;
		System.out.println("a multiplicação é:"+r);
		SolicitarNumero();
	}
	
	public void Dividir() {
	
		double r;
		r = num1 / num2;
		System.out.println("a divisão é:"+r);
		SolicitarNumero();
	}
}