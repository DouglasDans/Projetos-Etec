import java.util.Scanner;

public class Calcula {

	double num1;
	double num2;

	public void SolicitarNumero() {
		Scanner ler= new Scanner(System.in);
		double n1,n2;
		System.out.println("Digite um n�mero");
		n1 = ler.nextDouble();
		System.out.println("digite o segundo n�mero");
		n2 = ler.nextDouble();
		
		num1 = n1;
		num2 = n2;
		EscolhaOperacao();
	}
	
	public void EscolhaOperacao(){
		Scanner ler= new Scanner(System.in);
		System.out.println("Qual vai ser a opera��o?");
		System.out.println("1 = Adi��o");
		System.out.println("2 = Subtra��o");
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
		System.out.println("a soma �:"+r);
		SolicitarNumero();
	}
	
	public void Subtrair () {
		
		double r;
		r = num1 - num2;
		System.out.println("a subtra��o �:"+r);
		SolicitarNumero();
	}
	
	public void Multiplicar() {
	
	double r;
		r = num1 * num2;
		System.out.println("a multiplica��o �:"+r);
		SolicitarNumero();
	}
	
	public void Dividir() {
	
		double r;
		r = num1 / num2;
		System.out.println("a divis�o �:"+r);
		SolicitarNumero();
	}
}