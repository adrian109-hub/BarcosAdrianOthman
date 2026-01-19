
public class Barco {
protected String modelo;
protected Motor motor;
protected double capacidadCombustible;
public Barco(String modelo, Motor motor, double capacidadCombustible) {
	super();
	this.modelo = modelo;
	this.motor = motor;
	this.capacidadCombustible = capacidadCombustible;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public Motor getMotor() {
	return motor;
}
public void setMotor(Motor motor) {
	this.motor = motor;
}
public double getCapacidadCombustible() {
	return capacidadCombustible;
}
public void setCapacidadCombustible(double capacidadCombustible) {
	this.capacidadCombustible = capacidadCombustible;
}
@Override
public String toString() {
	return "Barco [modelo=" + modelo + ", motor=" + motor + ", capacidadCombustible=" + capacidadCombustible + "]";
}

public double calcularAutonomia() {
    return capacidadCombustible / motor.getConsumo();
}
}
