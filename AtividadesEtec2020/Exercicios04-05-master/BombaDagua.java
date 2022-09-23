public class BombaDagua {
	Boolean status;

	public void Ligar(int t){
		status = true;
		System.out.println("Bomba ligada");
		int i;
		for(i = 0; i < t; i++)
		{	try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				System.out.println("ERRO");
			}
			System.out.println("Bomba desligando em: " + (t-i));
		}
		
	}

	public void Desligar() {
		System.out.println("Bomba desligada");
		status = false;
	   
	}
}
