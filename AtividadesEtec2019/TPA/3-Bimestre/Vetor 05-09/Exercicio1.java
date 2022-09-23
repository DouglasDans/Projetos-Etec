import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args []) {
	Scanner ler = new Scanner(System.in);
	int i,j=0,v [];
	v=new int [12];
	for (i=0;i<12;i++) {
		System.out.println("Entre com o "+(i+1)+ "° mês do ano");
		v[i] = ler.nextInt();
	}
		for(i=0;i<12;i++) {
			
			System.out.println(i+1);
		} 
}
}