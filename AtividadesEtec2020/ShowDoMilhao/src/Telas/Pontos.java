package Telas;

public class Pontos {
	static int acerto = 0;
	static int erro = 0;
	
	
	public static void errou() {
		erro++;
	}
	
	public static void acertou() {
		acerto++;
	}
	
	public static int getAcerto() {
		return acerto;
	}
	
	public static int getErro() {
		return erro;
	}
}
