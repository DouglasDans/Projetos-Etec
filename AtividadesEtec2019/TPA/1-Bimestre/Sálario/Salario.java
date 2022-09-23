import java.util.Scanner;
public class Salario {
	public static void main (String [] args) {
	double s,vm;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite o sálario");
	s=leia.nextDouble();
	vm=s/100*30;
System.out.println("valor maximo do salário "+vm);		
	}
}
