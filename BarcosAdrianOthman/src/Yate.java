public class Yate extends Barco {
	protected int camarotes;

	public Yate(String modelo, int potencia, double capacidadCombustible, int camarotes) {
		super(modelo, potencia, capacidadCombustible);
		this.camarotes = camarotes;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	@Override
	public double calcularAutonomia() {
		// TODO Auto-generated method stub
		return super.calcularAutonomia();
	}

	@Override
	public String toString() {
		return "Yate [camarotes=" + camarotes + ", modelo=" + modelo + ", potencia=" + potencia
				+ ", capacidadCombustible=" + capacidadCombustible + ", consumoMotor=" + consumoMotor + ", horas="
				+ horas + "]";
	}
}
