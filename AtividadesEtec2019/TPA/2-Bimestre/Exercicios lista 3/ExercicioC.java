import java.util.Scanner;
public class ExercicioC {
	public static void main(String[]Args) {
		int i = 1,r = 0,h,k = 0;// i= while,  r= base, h = expoente, k =base repetida, na realidade nem precisa
		Scanner ler=new Scanner(System.in);
		System.out.println("Digite a base");
		r=ler.nextInt();
		k=r;
		System.out.println(r+" Sera elvevado a qual numero?");
		h=ler.nextInt();
		h=h+1;
		while (i<h-1) {
			r=k*r;
			
			i++;
			
		
		}System.out.println("resultado = "+r);
		
	}
		
}
