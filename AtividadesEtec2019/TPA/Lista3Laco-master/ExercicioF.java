import java.util.Scanner;
public class ExercicioF {
	public static void main(String[]Args) {
		int p = 0,i = 0,k,a = 0,ant = 0; // p = numero atual , i = while , k = numero de termos , a = numero atual,
		//ant = numero anterior
		Scanner ler=new Scanner(System.in);
		System.out.println("Digite o numero de termos");
		k=ler.nextInt(); 
		ant=0;
		p=1;
		while(i < k){
			a=ant+p;
			System.out.println("Resultado "+a);
			ant=p;
			p=a;
			i++;
		}
}
}
