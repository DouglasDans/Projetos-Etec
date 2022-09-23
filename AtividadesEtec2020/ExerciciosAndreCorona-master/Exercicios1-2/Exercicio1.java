public class Exercicio1 {

       boolean status;
       boolean observar;

        public void Ligar(){
        	status = true;
        }
        
        public void Desligar(){
        	status = false;
        }
        
        public void Observar(){
          if(status == true){
            System.out.println("ligada");
          }else{
            System.out.println("desligada");
          }
        }

}
