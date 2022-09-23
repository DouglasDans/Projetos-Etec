package Exercicio1;

public class Gps {

private String idioma;
private String rota;

public String getIdioma() {
             return idioma;
}
public void setIdioma(String idioma) {
             this.idioma = idioma;
}
public String getRota() {
             return rota;
}
public void setRota(String rota) {
             this.rota = rota;
}
public void Mostrar() {
          System.out.println("Idioma: "+getIdioma());
          System.out.println("Rota: "+getRota());
 }
}


