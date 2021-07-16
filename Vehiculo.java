import java.util.Arrays;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String color;
	private Rueda[] ruedasDelanteras;
	private Rueda[] ruedasTraseras;
	protected int numRuedas = 0;

	// Constructor
	public Vehiculo(String matricula, String marca, String color) {
		comprovarMatricula(matricula);
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	private double comprovarDiametro(double diametro) {
		if (diametro < 0.4 && diametro > 4) {
			diametro = 2;
		}
		return diametro;
	}

	private String comprovarMatricula(String matricula) {
		String[] matricula1 = matricula.split(" ");
		boolean correcto = true;

		for (int i = 0; i < 4; i++) {
			char c = matricula.charAt(i);
			if ((c <= 'a' && c >= 'z') || (c <= 'A' && c >= 'Z')) {

			} else {
				correcto = false;
			}
		}
		for (int j = 4; j < 7; j++) {
			int a = matricula.charAt(j);
			if (a >= 1 || a <= 9 && (a != ' ')) {

			} else {
				matricula = "abcd123";
			}
		}
		return matricula;
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
		return "matricula=" + matricula + ", marca=" + marca + ", color=" + color;
	}

}
