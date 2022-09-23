import java.util.Scanner;
public class Bissexto {
	public static void main(String[] args) {
	int an,bi;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite o ano de nascimento");
	an=leia.nextInt();
	bi=an%4;
	if(bi=0){
		System.out.println("Ano Bissexto");
	}else {
		System.out.println("Ano não Bissexto");
	}
	}	
}

