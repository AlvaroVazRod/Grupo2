package main;

public class Vehicle {
	protected String matricula;
	protected String marca;
	protected String color;
	protected Rueda[] ruedasTraseras;
	protected Rueda[] ruedasDelanteras;
	protected int numRuedas = 0;
	protected Persona titular;
	protected Persona[] conductor;

	public Vehicle (String matricula, String marca, String color,Rueda ruedasDelanteras2,Rueda ruedasTraseras2, Persona titular) {
		comprovarMatricula(matricula);
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.titular=titular;
		this.conductor=new Conductor[50];
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

	private double comprovarDiametro(double diametro) {
		if (diametro > 4 || diametro < 0.4) {
			diametro = 2;
		}
		return diametro;
	}
	public void añadirConductor() {
		
	}

	@Override
	public String toString() {
		return "Vehicle [matricula=" + matricula + ", marca=" + marca + ", color=" + color + "]";
	}

}
