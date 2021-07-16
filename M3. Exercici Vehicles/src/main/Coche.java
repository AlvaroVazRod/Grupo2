package main;

import java.util.Arrays;

public class Coche {
	private String matricula;
	private String marca;
	private String color;
	private Rueda[] ruedasTraseras;
	private Rueda[] ruedasDelanteras;
	protected int numRuedas = 0;

	public Coche(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		ruedasTraseras = new Rueda[2];
		ruedasDelanteras = new Rueda[2];
	}

	private double comprovarDiametro(double diametro) {
		if (diametro > 4 || diametro < 0.4) {
			diametro = 2;
		}
		return diametro;
	}
	private String comprovarMatricula(String matricula) {
		boolean correcto=true;
		for (int i = 0; i < 4; i++) {
			char c =matricula.charAt(i);
			if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c!=' ')) {
				
			}else {
				correcto=false;
			}
		}
		for (int j = 4; j < 7; j++) {
			int a = matricula.charAt(j);
			if ((a>=1||a<=9)&&(a!=' ')) {
				
			}else {
				correcto=false;
			}
		}
		if (correcto=false) {
			matricula="abcd123";
		}
		return matricula;
	}

	public void AñadirRuedaTrasera(String marca, double diametro) {
		comprovarDiametro(diametro);
		Rueda r = new Rueda(marca, diametro);
		ruedasTraseras[numRuedas] = r;
		numRuedas++;
		if (numRuedas > 1) {
			numRuedas = 0;
		}
	}

	public void AñadirRuedaDelantera(String marca, double diametro) {
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
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", ruedasTraseras="
				+ Arrays.toString(ruedasTraseras) + ", ruedasDelanteras=" + Arrays.toString(ruedasDelanteras) + "]";
	}

}
