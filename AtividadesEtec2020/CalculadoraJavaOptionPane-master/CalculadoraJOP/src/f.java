import java.util.Scanner;
import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
public class f {

	Double num1;
	Double num2;
	int global;

	public void menu245() {
		Scanner ler= new Scanner(System.in);
		Double num1,num2;
		int m;
		
		System.out.println("Digite um número");
		num1 = ler.nextDouble();
		System.out.println("Manda mais um");
		num2 = ler.nextDouble();
		
		f Cola = new f();
		Cola.num1 = num1;
		Cola.num2 = num2;
		
		System.out.println("Qual vai ser a operação?");
		System.out.println("1 = Adição");
		System.out.println("2 = Subtração");
		System.out.println("3 = Multiplicacao");
		System.out.println("4 = Divisao");
		System.out.println("5 = Finalizar Programa");
		
		m = ler.nextInt();
		switch(m) {
			case 1:
				Cola.somar();
			case 2:
				Cola.subtrair();
			case 3:
				Cola.multiplicar();
			case 4:
				Cola.dividir();
			case 5:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
		}	
	}
	
	public void somar() {
	
		Double r;
		r = num1 + num2;
		System.out.println("a soma é:"+r);
		menu245();
	}
	
	public void subtrair () {
		
		Double r;
		r = num1 - num2;
		System.out.println("a subtração é:"+r);
		menu245();
	}
	
	public void multiplicar() {
	
		Double r;
		r = num1 * num2;
		System.out.println("a multiplicação é:"+r);
		menu245();
	}
	
	public void dividir() {
	
		Double r;
		r = num1 / num2;
		System.out.println("a divisão é:"+r);
		menu245();
	}
}