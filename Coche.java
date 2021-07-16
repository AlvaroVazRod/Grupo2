import java.util.Arrays;

public class Coche extends Vehiculo {
	private Rueda[] ruedasDelanteras;
	private Rueda[] ruedasTraseras;
	protected int numRuedas = 0;

	// Constructor
	public Coche(String matricula, String marca, String color) {
		super(matricula, marca, color);
		ruedasDelanteras = new Rueda[2];
		ruedasTraseras = new Rueda[2];
	}

	private double comprovarDiametro(double diametro) {
		if (diametro < 0.4 || diametro > 4) {
			diametro = 2;
		}
		return diametro;
	}

	public void añadirRuedaTrasera(String marca, double diametro) {
		comprovarDiametro(diametro);
		Rueda r = new Rueda(marca, diametro);
		ruedasTraseras[numRuedas] = r;
		numRuedas++;
		if (numRuedas > 1) {
			numRuedas = 0;
		}
	}

	public void añadirRuedaDelantera(String marca, double diametro) {
		comprovarDiametro(diametro);
		Rueda r = new Rueda(marca, diametro);
		ruedasDelanteras[numRuedas] = r;
		numRuedas++;
		if (numRuedas > 1) {
			numRuedas = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "ruedasDelanteras=" + Arrays.toString(ruedasDelanteras) + ", ruedasTraseras="
				+ Arrays.toString(ruedasTraseras) + ", numRuedas=" + numRuedas + "]";
	}

}
