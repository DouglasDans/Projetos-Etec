
public class UsaLampada {
	Exercicio1 Lamp = new Exercicio1();
	public static void main(String[] args) {
		Exercicio1 Lampada1 = new Exercicio1();
		Lampada1.Ligar();
		
		Exercicio1 Lampada2 = new Exercicio1();
		Lampada2.Desligar();
		
		System.out.println("Lampada 1:");
		Lampada1.Observar();
		
		System.out.println("Lampada 2:");
		Lampada2.Observar();
	}
}
