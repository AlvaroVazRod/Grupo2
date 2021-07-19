package main;

import java.util.Arrays;

public class Coche extends Vehicle {
	private Rueda[] ruedasTraseras;
	private Rueda[] ruedasDelanteras;
	protected int numRuedas = 0;

	public Coche(String matricula, String marca, String color,Rueda ruedasTraseras,Rueda ruedasDelanteras, Persona titular) {
		super(matricula, marca, color, ruedasDelanteras, ruedasTraseras,titular);
		this.ruedasDelanteras= new Rueda[2];
		this.ruedasTraseras= new Rueda[2];
		comprovarDiametro(ruedasTraseras.getDiametro());
		comprovarDiametro(ruedasDelanteras.getDiametro());
		for (int i = 0; i < this.ruedasDelanteras.length; i++) {
			this.ruedasDelanteras[i]=ruedasDelanteras;
			this.ruedasTraseras[i]=ruedasTraseras;
		}
	}
	public Coche(String matricula, String marca, String color,Rueda ruedasTraseras,Rueda ruedasDelanteras) {
		super(matricula, marca, color, ruedasDelanteras, ruedasTraseras);
		this.ruedasDelanteras= new Rueda[2];
		this.ruedasTraseras= new Rueda[2];
		comprovarDiametro(ruedasTraseras.getDiametro());
		comprovarDiametro(ruedasDelanteras.getDiametro());
		for (int i = 0; i < this.ruedasDelanteras.length; i++) {
			this.ruedasDelanteras[i]=ruedasDelanteras;
			this.ruedasTraseras[i]=ruedasTraseras;
		}
	}
	public String toString() {
		return super.toString()+ "ruedasTraseras=" + Arrays.toString(ruedasTraseras) + ", ruedasDelanteras="
				+ Arrays.toString(ruedasDelanteras) + ", numRuedas=" + numRuedas + "]";
	}



}
