import java.util.Scanner;
public class Exercicioa {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int a[],i,t=0,ti = 0,p=0,impar=0,par=0;
	a= new int [10];
	for(i=0; i<10; i++) {
		System.out.println("Digite o elemento");
		a[i] = ler.nextInt();
	}
	for (i=0; i<10; i++) {
		if (a[i] %2==0) {
			t+=a[i];
			par++;
		}else {
			ti+=a[i];
			impar++;
		}	
	}
	System.out.println("Média dos pares: "+par);
	System.out.println("Média dos Ímpares: "+impar);
	}

}
