import java.util.Scanner;
public class Professor {
	public static void main(String [] args) {
	int va,na,in,sl;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite o valor da aula");
	va=leia.nextInt();
	System.out.println("digite o n�mero de aula");
	na=leia.nextInt();	
	System.out.println("digite o percentual do inss");
	in=leia.nextInt();
	sl=na*va-in;
	System.out.println("s�lario liquido "+sl);
	}
}
