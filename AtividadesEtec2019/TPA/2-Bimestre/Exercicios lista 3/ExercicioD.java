import java.util.Scanner;
public class ExercicioD {
	public static void main(String[]Args) {
		Scanner ler = new Scanner(System.in);
		double km,mes,d = 0,s = 0; //km = distancia da estrada, mes = meses, d = calculo do mes
		System.out.println("Digite a distancia da estrada em km");
		km =ler.nextInt();
		mes=3.75;
		while (mes<=km) {
			d=mes;
			mes=mes+3.75;
		}d=d/3.75;
		d=d+1.0;
		System.out.println("Vai demorar "+d+" meses para terminar a estrada");
		
	}

}