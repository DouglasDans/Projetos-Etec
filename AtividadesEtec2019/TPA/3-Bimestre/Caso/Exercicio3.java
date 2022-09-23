import java.util.Scanner;
public class Exercicio3 {
	public static void main (String [] Args) {
	Scanner ler = new Scanner (System.in);
	int d=0,m,v=0;
	System.out.println("digite o mes de nascimento");
	m=ler.nextInt();
	System.out.println("digite o dia de nascimento");
	d=ler.nextInt();
	if(m==1 && d>20 || m==2 && d<18) {
		v+=1;	
	}
	else if(m==2 && d>=19 || m==3 && d<=20) {
		v+=2;
	}
	else if(m==3 && d>=21 || m==4 && d<=19) {
		v+=3;
	}
	else if(m==4 && d>=20 || m==5 && d<=20) {
		v+=4;
	}
	else if(m==5 && d>=21 || m==6 && d<=20) {
		v+=5;
	}
	else if(m==6 && d>=21 || m==7 && d<=22) {
		v+=6;
	}
	else if(m==7 && d>=23 || m==8 && d<=22) {
		v+=7;
	}
	else if(m==8 && d>=23 || m==9 && d<=22) {
		v+=8;
	}
	else if(m==9 && d>=23 || m==10 && d<=22) {
		v+=9;
	}
	else if(m==10 && d>=23 || m==11 && d<=21) {
		v+=10;
	}
	else if(m==11 && d>=22 || m==12 && d<=21) {
		v+=11;
	}
	else if(m==12 && d>=22 || m==1 && d<=19) {
		v+=12;
	}
	switch(v) {
	case 1:
	{
		System.out.println("Aquario");
		break;
	}
	case 2:
	{
		System.out.println("Peixes");
		break;
	}
	case 3:
	{
		System.out.println("Àries");
		break;
	}
	case 4:
	{
		System.out.println("Touro");
		break;
	}
	case 5:
	{
		System.out.println("Gemeos");
		break;
	}
	case 6:
	{
		System.out.println("Cancer");
		break;
	}
	case 7:
	{
		System.out.println("Leão");
		break;
	}
	case 8:
	{
		System.out.println("Virgem");
		break;
	}
	case 9:
	{
		System.out.println("Libra");
		break;
	}
	case 10:
	{
		System.out.println("Escorpião");
		break;
	}
	case 11:
	{
		System.out.println("Sargitario");
		break;
	}
	case 12:
	{
		System.out.println("Capricornio");
		break;	
	}
	default:
		System.out.println("data invalida");
		break;
	}
	}
}
