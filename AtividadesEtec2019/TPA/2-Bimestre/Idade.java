import java.util.Scanner;
public class Idade{ 
	public static void main(String[] args) {
	int at,an,id;
	Scanner leia=new Scanner(System.in);
	System.out.println("digite o ano atual");
	at=leia.nextInt();
	System.out.println("digite o ano de nascimento");
	an=leia.nextInt();
	id=at-an;
	if(id>18) {
		System.out.println("você é maior de idade");
	}else {
		System.out.println("você é menor de idade");}
	}
	
}
