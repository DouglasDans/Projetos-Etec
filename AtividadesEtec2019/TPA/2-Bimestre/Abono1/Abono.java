import java.util.Scanner;
public class Abono {
	public static void main(String[]args) {
		double sl,abn,sl2;
		long s;
		boolean n;
		Scanner leia=new Scanner(System.in);
		System.out.println("Digite O seu sal�rio");
		sl=leia.nextInt();
		sl2=sl+(sl/30)*10;
		abn=(sl/30)*10;
		System.out.println("Seu sal�rio de f�rias � de R$"+sl2+"  Caso queira vender suas f�rias, digite 1");
		s=leia.nextLong();
		if (s==1) {
			System.out.println("F�rias Vendidas. Seu abono � de R$"+abn);
		}else {
			System.out.println("Eu disse digite 1, seu sal�rio continua R$"+sl2);
		}
		
		
		
}
}
