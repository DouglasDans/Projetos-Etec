import java.util.Scanner;
public class Exercicio4 {
	public static void main (String args []) {
	Scanner ler = new Scanner(System.in);
		int i,d, v[];
		v=new int[7];
		for (i=0;i<7;i++) {
			System.out.println("Entre com o "+(i+1)+" ° numero ");
			v[i] = ler.nextInt();
		}
			
			for(i=0;i<7;i++) {
				d=v [i];
				d=d*2;
			System.out.println(d);
		} 
	
	

}
}