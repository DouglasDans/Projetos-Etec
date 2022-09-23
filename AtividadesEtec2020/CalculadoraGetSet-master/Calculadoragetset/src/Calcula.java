import java.util.Scanner;
import java.util.Set;

public class Calcula {

	private double num1;
	private double num2;
	private double resultado;
	private String operacao;
	
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num1;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double Resultado) {
		this.resultado = Resultado;
	}

	public void SolicitarNumero() {
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		num1 = ler.nextDouble();
		System.out.println("digite o segundo número");
		num2 = ler.nextDouble();
	}
	
	public void EscolhaOperacao(){
		Scanner ler= new Scanner(System.in);
		
		System.out.println("digite a operação");
		operacao = ler.next();
		
		if(operacao.equals("+")){
			this.Somar();
		}else if(operacao.equals("-")) {
			this.Subtrair();
		}else if(operacao.equals("*")) {
			this.Multiplicar();
		}else if(operacao.equals("/")) {
			this.Dividir();
		}
	}
	

	public void Somar() {
		resultado = num1 + num2;
		System.out.println("a soma é:"+resultado);
	}
	
	public void Subtrair () {
		resultado = num1 - num2;
		System.out.println("a subtração é:"+resultado);
	}
	
	public void Multiplicar() {
		resultado = num1 * num2;
		System.out.println("a multiplicação é:"+resultado);
	}
	
	public void Dividir() {
		resultado = num1 / num2;
		System.out.println("a divisão é:"+resultado);
	}
}