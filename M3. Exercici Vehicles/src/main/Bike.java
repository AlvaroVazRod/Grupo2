package main;

import java.util.Arrays;

public class Bike extends Vehicle{
	private Rueda[] ruedasTraseras;
	private Rueda[] ruedasDelanteras;
	protected int numRuedas = 0;

	public Bike (String matricula, String marca, String color) {
		super(matricula,marca,color);
		ruedasTraseras = new Rueda[1];
		ruedasDelanteras = new Rueda[1];
	}

	private double comprovarDiametro(double diametro) {
		if (diametro > 4 || diametro < 0.4) {
			diametro = 2;
		}
		return diametro;
	}

	public void AñadirRuedaTrasera(String marca, double diametro) {
		comprovarDiametro(diametro);
		Rueda r = new Rueda(marca, diametro);
		ruedasTraseras[numRuedas] = r;
		numRuedas++;
		if (numRuedas >= 1) {
			numRuedas = 0;
		}
	}

	public void AñadirRuedaDelantera(String marca, double diametro) {
		comprovarDiametro(diametro);
		Rueda r = new Rueda(marca, diametro);
		ruedasDelanteras[numRuedas] = r;
		numRuedas++;
		if (numRuedas >= 1) {
			numRuedas = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString()+ " [ruedasTraseras=" + Arrays.toString(ruedasTraseras) + ", ruedasDelanteras="
				+ Arrays.toString(ruedasDelanteras) + ", numRuedas=" + numRuedas + "]";
	}


}
