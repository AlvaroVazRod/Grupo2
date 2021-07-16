package main;

import java.util.Arrays;

public class Vehicle {
	protected String matricula;
	protected String marca;
	protected String color;

	public Vehicle (String matricula, String marca, String color) {
		comprovarMatricula(matricula);
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	private String comprovarMatricula(String matricula) {
		boolean correcto=true;
		for (int i = 0; i < 4; i++) {
			char c =matricula.charAt(i);
			if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c!=' ')) {
				correcto=true;
			}else {
				correcto=false;
			}
		}
		for (int j = 4; j < 7; j++) {
			int a = matricula.charAt(j);
			if ((a>=1||a<=9)&&(a!=' ')) {
				correcto=true;
			}else {
				correcto=false;
			}
		}
		if (correcto=false) {
			matricula="abcd123";
		}
		return matricula;
	}

	@Override
	public String toString() {
		return "Vehicle [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]";
	}

}
