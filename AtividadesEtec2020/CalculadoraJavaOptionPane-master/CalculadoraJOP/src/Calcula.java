import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Calcula {

	double num1;
	double num2;

	public void SolicitarNumero() {
		Scanner ler= new Scanner(System.in);
		String n1,n2;
		n1 = JOptionPane.showInputDialog(null, " Entre com o numero: ");
		n2 = JOptionPane.showInputDialog(null, " Entre com outro numero: ");
		double n1Int = Integer.parseInt(n1);
		double n2Int = Integer.parseInt(n2);
		num1 = n1Int;
		num2 = n2Int;
		EscolhaOperacao();
	}
	
	public void EscolhaOperacao(){
		String m;
		Scanner ler= new Scanner(System.in);
		m = JOptionPane.showInputDialog(null, "Qual vai ser a opera��o?");
		switch(m) {
			case "adi��o":
				Somar();
			case "subtra��o":
				Subtrair();
			case "multiplica��o":
				Multiplicar();
			case "Divis�o":
				Dividir();
			default:
				JOptionPane.showMessageDialog(null, "Opera��o incorreta, digite em min�sculo e com acentos");
				EscolhaOperacao();
		}	
	}
	

	public void Somar() {
		JFrame frame = new JFrame("frame");
		double r;
		r = num1 + num2;
		JOptionPane.showMessageDialog(null, "o resultado �: "+r);
		SolicitarNumero2();
	}
	
	public void Subtrair () {
		
		double r;
		r = num1 - num2;
		JOptionPane.showMessageDialog(null, "o resultado �: "+r);
		SolicitarNumero2();
	}
	
	public void Multiplicar() {
	
	double r;
		r = num1 * num2;
		JOptionPane.showMessageDialog(null, "o resultado �: "+r);
		SolicitarNumero2();
	}
	
	public void Dividir() {
	
		double r;
		r = num1 / num2;
		JOptionPane.showMessageDialog(null, "o resultado �: "+r);
		SolicitarNumero2();
	}
	public void SolicitarNumero2() {
		JFrame frame = new JFrame("JOptionPane exemplo");

	    int resposta = JOptionPane.showConfirmDialog(frame,"Deseja continuar?", "Finalizando programa", JOptionPane.YES_NO_OPTION);
	    if (resposta == JOptionPane.YES_OPTION) {
	    	SolicitarNumero();
	      }
	      else {
	         System.exit(0);
	      }
	}
}