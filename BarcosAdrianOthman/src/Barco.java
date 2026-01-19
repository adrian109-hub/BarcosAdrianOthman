
public class Barco {
protected String modelo;
protected int potencia;
protected double capacidadCombustible;
public Barco(String modelo, int potencia, double capacidadCombustible) {
	super();
	this.modelo = modelo;
	this.potencia = potencia;
	this.capacidadCombustible = capacidadCombustible;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getPotencia() {
	return potencia;
}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}
public double getCapacidadCombustible() {
	return capacidadCombustible;
}
public void setCapacidadCombustible(double capacidadCombustible) {
	this.capacidadCombustible = capacidadCombustible;
}
@Override
public String toString() {
	return "Barco [modelo=" + modelo + ", potencia=" + potencia + ", capacidadCombustible=" + capacidadCombustible
			+ "]";
}


}
