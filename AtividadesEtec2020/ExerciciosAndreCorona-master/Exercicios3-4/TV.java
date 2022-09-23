public class TV {

      private boolean OnOff;
      private int canal;
      private int volume;
      
      
        public boolean getOnOff() {
        return OnOff;
    }
        public void setOnOff(boolean OnOff) {
        this.OnOff = OnOff;
    }
    
        public int getCanal() {
          return canal;
        }
        public void setCanal(int canal) {
          this.canal = canal;
        }
        
        public int getVolume() {
          return volume;
        }
        public void setVolume(int volume) {
          this.volume = volume;
        }
        
        public void mostar() {
        	if (OnOff == true) {
        		System.out.println("TV Ligada");
        		if (canal <1000) {
            		System.out.println("A TV esta no canal "+canal);
            	}else {
            		System.out.println("Canal inválido");
            	}
            	if (volume <=100) {
            		System.out.println("A TV esta no volume "+volume);
            	}else {
            		System.out.println("Volume inválido");
            	}
        	}else {
        		System.out.println("TV Desligada");
        	}
        	
        	
        }

        

}
