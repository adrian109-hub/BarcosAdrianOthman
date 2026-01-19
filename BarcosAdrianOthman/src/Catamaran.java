
public class Catamaran extends Barco {
protected Motor motorSecundario;


public Catamaran(String modelo, Motor motor, double capacidadCombustible, Motor motorSecundario) {
	super(modelo, motor, capacidadCombustible);
	this.motorSecundario = motorSecundario;
}


public Motor getMotorSecundario() {
	return motorSecundario;
}



public void setMotorSecundario(Motor motorSecundario) {
	this.motorSecundario = motorSecundario;
}




public double calcularAutonomia() {
	
	  return (capacidadCombustible/motor.consumo+capacidadCombustible/motorSecundario.consumo);
}


}
