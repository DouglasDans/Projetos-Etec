public class Caminhao {
	private String combustivel;
    private int velocidade;
    
    
      public String getCombustivel() {
      return combustivel;
  }
      public void setCombustivel(String combustivel) {
      this.combustivel = combustivel;
  }
  
      public int getvelocidade() {
        return velocidade;
      }
      public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
      }
      
      public void mostar() {
    	  switch(combustivel) {
    	  		case "gasolina":
    	  			System.out.println("Seu combust�vel � Gasolina");
    	  			break;
    	  		case "diesel":
    	  			System.out.println("Seu combust�vel � diesel");
    	  			break;
    	  		case "gas":
    	  			System.out.println("Seu combust�vel � g�s");
    	  			break;
    	  }  
    	  if (velocidade <=150) {
      		System.out.println("Seu caminh�o esta a "+velocidade+"Km/h");
    	  }else {
      		System.out.println("Velocidade inv�lida");
      }
      }
}