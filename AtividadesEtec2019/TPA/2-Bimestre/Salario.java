import java.util.Scanner;
public class Salario {
	public static void main(String [] args) {
	double sl,im1,im2,im3,im4;	
	Scanner leia=new Scanner(System.in);
	System.out.println("digite seu salario");
	sl=leia.nextDouble();
	im1=(sl*7.5/100)-142.80;
	im2=(sl*15.0/100)-354.80;
	im3=(sl*22.5/100)-636.13;
	im4=(sl*27.5/100)-869.36;
	if(sl<1904) {
		System.out.println("não tem imposto");
	}else if(sl>1904 && sl<2827) {
		System.out.println("tem imposto de "+im1);
	}else if(sl>2827 && sl<3752) {
		System.out.println("tem imposto de "+im2);
	}else if(sl>3752 && sl<4665) {
		System.out.println("tem imposto de "+im3);
	}else if(sl>4665) {
		System.out.println("tem imposto de "+im4);
	}
	
}
}
