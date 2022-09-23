public class Quadrado {
	private double lado;
    public double getlado() {
    return lado;
}
    public void setCombustivel(double lado) {
    this.lado = lado;
}
	public void setLado(double l) {
		if( l < 0 ) throw new RuntimeException ("Lado invalido");
		lado = l;
    }
	public double area() {
	return lado * lado;

	}
}