import java.util.Scanner;
public class ExercicioB {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double i,l,v,c,m,vt = 0,ct,lt;
	System.out.println("Digite o valor de custo");
	c=ler.nextDouble();
	for(i=0;i<52;i++) {
		System.out.println("Semana "+(i+1)+" Informe o valor das vendas");
		v=ler.nextDouble();
		vt+=v;
	}
	ct=(c*52);
	System.out.println("Custo total é: "+ct);
	lt=vt-ct;
	System.out.println("Lucro total é: "+lt);
	m=lt/52;
	System.out.println("Lucro Médio é: "+m);
	
	
	}

}
