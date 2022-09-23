import java.util.Scanner;
public class Exercicioa {
	public static void main (String [] Args) {
		Scanner ler = new Scanner (System.in);	
		double sal,i=1,mesmaior,mesmenor,maior,menor,soma=0,media;
		System.out.println("mes "+i+" digite o salario");
		sal=ler.nextDouble();
		soma=soma+sal;
		maior=sal;
		menor=sal;
		mesmaior=1;
		mesmenor=1;
		soma=sal;
		for (i=2 ; i<12 ; i++) {
			System.out.println("mes "+i+" digite o salario");
			sal=ler.nextDouble();
			soma=soma+sal;
			if(sal>maior) {
				maior=sal;
				mesmaior=i;
			}else if(sal<menor) {
				menor=sal;
				mesmenor=i;
			}
		}
		media=soma/12;
		System.out.println("mes "+i+ "salario menor "+menor);
		System.out.println("mes "+i+" salario maior "+maior);
		System.out.println("rendimento do salario "+soma);
		System.out.println("salario medio "+media);
	}
}
