public class Yate extends Barco {
	protected int camarotes;

	public Yate(String modelo, Motor motor, double capacidadCombustible, int camarotes) {
		super(modelo, motor, capacidadCombustible);
		this.camarotes = camarotes;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	@Override
	public String toString() {
		return "Yate [camarotes=" + camarotes + ", modelo=" + modelo + ", motor=" + motor + ", capacidadCombustible="
				+ capacidadCombustible + "]";
	}

	@Override
	public double calcularAutonomia() {
		
		return super.calcularAutonomia();
	}

	
	}

