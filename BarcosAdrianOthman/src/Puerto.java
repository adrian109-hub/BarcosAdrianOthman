import java.util.ArrayList;

public class Puerto {
	protected ArrayList<Barco> lista;

	public Puerto(ArrayList<Barco> lista) {
		super();
		this.lista = new ArrayList<Barco>();
	}

	public ArrayList<Barco> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Barco> lista) {
		this.lista = lista;
	}
	public boolean entrarBarco(Barco b) {
		if (lista.size()>4) {
			System.out.println("Barco lleno");
			return false;
		} else {
			lista.add(b);
			System.out.println("El barco se añadio");
			return true;
		}
	}
	public boolean salirBarco(Barco b) {
		if (lista.contains(b)) {
			lista.remove(b);
			System.out.println("El barco se elimino");
			return true;
		} else {
			System.out.println("No existe el barco");
			return false;
		}
	}
	
	public double calcularPrecioViaje(Barco b, int horas, double precioCombustible) {
		if (b instanceof Yate) {
			Yate barc = (Yate) b;
			if (barc.calcularAutonomia()<horas) {
				return -1;
			}
			return horas*b.getMotor().getConsumo() * precioCombustible;
		}  else if (b instanceof Catamaran){
			Catamaran cata = (Catamaran) b;
			if (cata.calcularAutonomia()<horas) {
				return -1;
			}
			return horas*b.getMotor().getConsumo() * precioCombustible;
		}
		return -1;
	}
}
